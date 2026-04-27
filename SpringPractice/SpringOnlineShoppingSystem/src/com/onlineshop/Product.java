package com.onlineshop;

public class Product {
    
    private int productId;
    private String productName;
    private double price;
    
    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
    
    public void showProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + String.format("%.2f", price));
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getProductName() {
        return productName;
    }
}