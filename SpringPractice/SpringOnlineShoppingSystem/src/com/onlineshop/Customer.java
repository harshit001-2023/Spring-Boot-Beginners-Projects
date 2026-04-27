package com.onlineshop;

public class Customer {
    
    private int customerId;
    private String customerName;
    private String address;
    
    public Customer(int customerId, String customerName, String address) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
    }
    
    public void showCustomerInfo() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Address: " + address);
    }
    
    public String getCustomerName() {
        return customerName;
    }
}