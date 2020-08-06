package com.rn.com.rn.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CountryStatesDetails implements Serializable {
    @JsonProperty("provinceState")
    private String provinceState;
    @JsonProperty("countryRegion")
    private String countryRegion;
    @JsonProperty("lastUpdate")
    private String lastUpdate;
    @JsonProperty("lat")
    private String lat;
    @JsonProperty("long")
    private String longitute;
    @JsonProperty("confirmed")
    private String confirmed;
    @JsonProperty("recovered")
    private String recovered;
    @JsonProperty("deaths")
    private String deaths;
    @JsonProperty("active")
    private String active;
    @JsonProperty("admin2")
    private String admin2;
    @JsonProperty("fips")
    private String fips;
    @JsonProperty("combinedKey")
    private String combinedKey;
    @JsonProperty("incidentRate")
    private String incidentRate;
    @JsonProperty("peopleTested")
    private String peopleTested;
    @JsonProperty("peopleHospitalized")
    private String peopleHospitalized;
    @JsonProperty("uid")
    private String uid;
    @JsonProperty("iso3")
    private String iso3;
}
