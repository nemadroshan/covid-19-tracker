package com.rn.com.rn.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

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
