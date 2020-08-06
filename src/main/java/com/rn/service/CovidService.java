package com.rn.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rn.com.rn.models.Country;
import com.rn.com.rn.models.ListCountries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

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
}
