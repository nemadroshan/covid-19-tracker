package com.rn.service;

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

    public List<String> getAllCountries(){
        System.out.println("CovidService.getAllCountries");

        ListCountries forObject = restTemplate.getForObject("https://covid19.mathdro.id/api/countries", ListCountries.class);
        List<Country> countries = forObject.getCountries();
        List<String> countryList = new ArrayList<>();
        for(Country c : countries){
            countryList.add(c.getName());
        }
        System.out.println(countryList);
        return countryList;
    }

    public Map<String,String> getWorldWideCovidDetails(){
        System.out.println("CovidService.getWorldWideCovidDetails");
        Map<String,String> map = new HashMap<>();
        Global globalData = restTemplate.getForObject("https://covid19.mathdro.id/api/", Global.class);
        map.put("confirmed",globalData.getConfirmed().getValue());
        map.put("recovered",globalData.getRecovered().getValue());
        map.put("death",globalData.getDeaths().getValue());
        map.put("lastUpdated",globalData.getLastUpdate());
        System.out.println(map);
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

    public List<CountryStatesDetails> getCountryStatesDetailsByCountryNameConfirmed(String countryName){
        System.out.println("CovidService.getConCountryStatesDetails");
        List<CountryStatesDetails> details =null;
        String url = "https://covid19.mathdro.id/api/countries/"+countryName+"/confirmed";
        ListCountryStatesDetails listCountryStatesDetails = restTemplate.getForObject(url, ListCountryStatesDetails.class);
        details= listCountryStatesDetails.getCountryStatesDetails();
        System.out.println(details);
        return  details;
    }
}
