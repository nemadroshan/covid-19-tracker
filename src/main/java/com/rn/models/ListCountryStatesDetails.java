package com.rn.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
@Setter
@Getter
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListCountryStatesDetails implements Serializable {
    public ListCountryStatesDetails() {
        System.out.println("ListCountryStatesDetails.ListCountryStatesDetails");
    }
    private List<CountryStatesDetails> countryStatesDetails;
}
