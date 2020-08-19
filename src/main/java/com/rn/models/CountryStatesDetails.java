package com.rn.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "provinceState",
        "countryRegion",
        "lastUpdate",
        "lat",
        "long",
        "confirmed",
        "recovered",
        "deaths",
        "active",
        "admin2",
        "fips",
        "combinedKey",
        "incidentRate",
        "peopleTested",
        "peopleHospitalized",
        "uid",
        "iso3"
})
@ToString
public class CountryStatesDetails {

    @JsonProperty("provinceState")
    private String provinceState;
    @JsonProperty("countryRegion")
    private String countryRegion;
    @JsonProperty("lastUpdate")
    private String lastUpdate;
    @JsonProperty("lat")
    private String lat;
    @JsonProperty("long")
    private String _long;
    @JsonProperty("confirmed")
    private String  confirmed;
    @JsonProperty("recovered")
    private String  recovered;
    @JsonProperty("deaths")
    private String  deaths;
    @JsonProperty("active")
    private String active;
    @JsonProperty("admin2")
    private Object admin2;
    @JsonProperty("fips")
    private Object fips;
    @JsonProperty("combinedKey")
    private String combinedKey;
    @JsonProperty("incidentRate")
    private Double incidentRate;
    @JsonProperty("peopleTested")
    private Object peopleTested;
    @JsonProperty("peopleHospitalized")
    private Object peopleHospitalized;
    @JsonProperty("uid")
    private String  uid;
    @JsonProperty("iso3")
    private String iso3;

    @JsonProperty("provinceState")
    public String getProvinceState() {
        return provinceState;
    }

    @JsonProperty("provinceState")
    public void setProvinceState(String provinceState) {
        this.provinceState = provinceState;
    }

    @JsonProperty("countryRegion")
    public String getCountryRegion() {
        return countryRegion;
    }

    @JsonProperty("countryRegion")
    public void setCountryRegion(String countryRegion) {
        this.countryRegion = countryRegion;
    }

    @JsonProperty("lastUpdate")
    public String getLastUpdate() {
        return lastUpdate;
    }

    @JsonProperty("lastUpdate")
    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @JsonProperty("lat")
    public String getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(String lat) {
        this.lat = lat;
    }

    @JsonProperty("long")
    public String getLong() {
        return _long;
    }

    @JsonProperty("long")
    public void setLong(String _long) {
        this._long = _long;
    }

    @JsonProperty("confirmed")
    public String getConfirmed() {
        return confirmed;
    }

    @JsonProperty("confirmed")
    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    @JsonProperty("recovered")
    public String getRecovered() {
        return recovered;
    }

    @JsonProperty("recovered")
    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    @JsonProperty("deaths")
    public String getDeaths() {
        return deaths;
    }

    @JsonProperty("deaths")
    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    @JsonProperty("active")
    public String getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(String active) {
        this.active = active;
    }

    @JsonProperty("admin2")
    public Object getAdmin2() {
        return admin2;
    }

    @JsonProperty("admin2")
    public void setAdmin2(Object admin2) {
        this.admin2 = admin2;
    }

    @JsonProperty("fips")
    public Object getFips() {
        return fips;
    }

    @JsonProperty("fips")
    public void setFips(Object fips) {
        this.fips = fips;
    }

    @JsonProperty("combinedKey")
    public String getCombinedKey() {
        return combinedKey;
    }

    @JsonProperty("combinedKey")
    public void setCombinedKey(String combinedKey) {
        this.combinedKey = combinedKey;
    }

    @JsonProperty("incidentRate")
    public Double getIncidentRate() {
        return incidentRate;
    }

    @JsonProperty("incidentRate")
    public void setIncidentRate(Double incidentRate) {
        this.incidentRate = incidentRate;
    }

    @JsonProperty("peopleTested")
    public Object getPeopleTested() {
        return peopleTested;
    }

    @JsonProperty("peopleTested")
    public void setPeopleTested(Object peopleTested) {
        this.peopleTested = peopleTested;
    }

    @JsonProperty("peopleHospitalized")
    public Object getPeopleHospitalized() {
        return peopleHospitalized;
    }

    @JsonProperty("peopleHospitalized")
    public void setPeopleHospitalized(Object peopleHospitalized) {
        this.peopleHospitalized = peopleHospitalized;
    }

    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    @JsonProperty("iso3")
    public String getIso3() {
        return iso3;
    }

    @JsonProperty("iso3")
    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }

}