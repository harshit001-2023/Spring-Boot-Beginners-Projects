package com.addressinjection;

public class Person {
    private String name;
    private Address address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Person name : " + name);
        System.out.println("Address     : " + address);
    }
}