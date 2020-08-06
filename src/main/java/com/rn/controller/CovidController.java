package com.rn.controller;

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
    }

    @GetMapping("/")
    private String home() {
        return "home";
    }

    @GetMapping("/home")
    public String getHome(Model model, @RequestParam("name") String name) throws URISyntaxException {
        System.out.println("inside controller");
        String url = "https://covid19.mathdro.id/api/countries/" + name;
        URI uri = new URI(url);
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<String>(headers);
        service.getAllCountries();

        Global global = restTemplate.getForObject(uri, Global.class);
        System.err.println(global);
        model.addAttribute("data", global);
        return "home";
    }
}
