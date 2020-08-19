package com.rn.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class ListCountries implements Serializable {
    @JsonProperty("countries")
    private List<Country> countries;
}
