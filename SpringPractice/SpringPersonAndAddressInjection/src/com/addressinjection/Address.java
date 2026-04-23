package com.addressinjection;

public class Address {
    private String city;
    private String country;

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // Getter methods (Good practice, though not strictly required here)
    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return city + ", " + country;
    }
}