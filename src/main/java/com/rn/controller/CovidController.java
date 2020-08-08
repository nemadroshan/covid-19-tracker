package com.rn.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.rn.com.rn.models.CountryStatesDetails;
import com.rn.com.rn.models.Global;
import com.rn.service.CovidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

@Controller
public class CovidController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private CovidService service;


    @ModelAttribute
    public void modelData(Model model){
        model.addAttribute("listCountry",service.getAllCountries());
        model.addAttribute("globalData",service.getWorldWideCovidDetails());
    }

    @GetMapping("/")
    private String home() {
        return "home";
    }

    @GetMapping("/home")
    public String getHome(Model model, @RequestParam("name") String name) throws URISyntaxException, JsonProcessingException {
        System.out.println("inside controller");
        final Global global = service.getCovidDetailsByCountryName(name);
        System.err.println(global);
        List<CountryStatesDetails> confirmed = service.getCountryStatesDetailsByCountryNameConfirmed(name);
        model.addAttribute("data", global);
        model.addAttribute("confirmed", confirmed);
        return "home";
    }
}
