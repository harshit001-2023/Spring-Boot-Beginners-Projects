package com.onlineshop;

public class BillService {
    
    private double taxPercentage;
    private double discountPercentage;
    
    // Constructor Injection for tax and discount
    public BillService(double taxPercentage, double discountPercentage) {
        this.taxPercentage = taxPercentage;
        this.discountPercentage = discountPercentage;
    }
    
    public double calculateTotal(Order order) {
        double baseAmount = order.getProduct().getPrice() * order.getQuantity();
        double taxAmount = baseAmount * (taxPercentage / 100);
        double discountAmount = baseAmount * (discountPercentage / 100);
        return baseAmount + taxAmount - discountAmount;
    }
}