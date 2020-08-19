package com.rn.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rn.com.rn.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;

@Service

public class CovidService {
    @Autowired
    private RestTemplate restTemplate;

    public Map<String,String> getAllCountries(){
        Map<String,String> map = new HashMap<>();
        ListCountries forObject = restTemplate.getForObject("https://covid19.mathdro.id/api/countries", ListCountries.class);
        List<Country> countries = forObject.getCountries();
        List<String> countryList = new ArrayList<>();
        for(Country c : countries){
            map.put(c.getIso2(),c.getName());
        }

        return map;
    }

    public Map<String,String> getWorldWideCovidDetails(){

        Map<String,String> map = new HashMap<>();
        Global globalData = restTemplate.getForObject("https://covid19.mathdro.id/api/", Global.class);
        map.put("confirmed",globalData.getConfirmed().getValue());
        map.put("recovered",globalData.getRecovered().getValue());
        map.put("death",globalData.getDeaths().getValue());
        map.put("lastUpdated",globalData.getLastUpdate());

        return map;
    }


    public Global getCovidDetailsByCountryName(String countryName) throws URISyntaxException {
        String url = "https://covid19.mathdro.id/api/countries/"+countryName;
        URI uri = new URI(url);
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<String>(headers);
        Global global = restTemplate.getForObject(uri, Global.class);
        return global;
    }

    public List<CountryStatesDetails> getCountryStatesDetailsByCountryNameConfirmed(String cName) throws URISyntaxException, JsonProcessingException {
        System.err.println("CovidService.getConCountryStatesDetails");
        System.err.println("Name : : "+cName);


        /*String[] split = cName.split(" ");
        StringBuilder builder = new StringBuilder("");
        for(int i=0;i<split.length;i++) {
            builder.append(split[i]+"%20");
        }
        String cs = builder.toString();
        System.out.println("New String :: "+cs);
        String s = cs.substring(0,cs.length()-3);*/


        //System.err.println("Name : : "+s);

        List<CountryStatesDetails> details =null;
        String url = "https://covid19.mathdro.id/api/countries/"+cName+"/confirmed";
        System.err.println("URL :: "+url);
        URI uri = new URI(url);
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        String forEntity = restTemplate.getForObject(uri,String.class);

        ObjectMapper mapper = new ObjectMapper();
        List<CountryStatesDetails> details1 = mapper.readValue(forEntity, new TypeReference<List<CountryStatesDetails>>() {
        });

        System.out.println(details1);
        for(CountryStatesDetails c :details1){
            System.out.println(c);
        }
        return  details1;
    }


}
