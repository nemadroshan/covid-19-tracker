package com.rn.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Confirmed implements Serializable {
    @JsonProperty("value")
    private String value;
    @JsonProperty("detail")
    private String detail;
}
