package com.rn.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
@Data
public class Country implements Serializable {
    @JsonProperty("name")
    private String name;
    @JsonProperty("iso2")
    private String iso2;
    @JsonProperty("iso3")
    private String iso3;
}
