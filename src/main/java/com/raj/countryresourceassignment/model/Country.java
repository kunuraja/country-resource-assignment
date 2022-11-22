package com.raj.countryresourceassignment.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long countryId;
    private String countryName;
    private String alpha3Code;

    public Country() {
    }

    public Country(Long countryId, String countryName, String alpha3Code) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.alpha3Code = alpha3Code;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getAlpha3Code() {
        return alpha3Code;
    }

    public void setAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
    }
}
