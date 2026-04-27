package com.onlineshop;

public class Order {
    
    private int orderId;
    private Customer customer;
    private Product product;
    private int quantity;
    
    // Constructor Injection: Customer and Product injected
    public Order(int orderId, Customer customer, Product product, int quantity) {
        this.orderId = orderId;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }
    
    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        customer.showCustomerInfo();
        product.showProductDetails();
        System.out.println("Quantity: " + quantity);
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    public Product getProduct() {
        return product;
    }
    
    public int getQuantity() {
        return quantity;
    }
}