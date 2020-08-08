package com.rn.com.rn.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
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
