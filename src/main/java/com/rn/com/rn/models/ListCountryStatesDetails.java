package com.rn.com.rn.models;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
public class ListCountryStatesDetails implements Serializable {
    private List<CountryStatesDetails> countryStatesDetails;
}
