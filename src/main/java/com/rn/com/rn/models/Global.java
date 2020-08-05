package com.rn.com.rn.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Global implements Serializable {
    @JsonProperty("confirmed")
    private Confirmed confirmed;
    @JsonProperty("recovered")
    private Recovered recovered;
    @JsonProperty("deaths")
    private Deaths deaths;
    @JsonProperty("lastUpdate")
    private String lastUpdate;

}
