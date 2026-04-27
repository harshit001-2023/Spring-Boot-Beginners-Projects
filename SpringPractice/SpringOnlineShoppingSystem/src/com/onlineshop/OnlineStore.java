package com.onlineshop;

public class OnlineStore {
    
    private Order order;
    private BillService billService;
    
    // Constructor Injection: Order and BillService
    public OnlineStore(Order order, BillService billService) {
        this.order = order;
        this.billService = billService;
    }
    
    public void generateInvoice() {
        System.out.println("=== INVOICE ===");
        order.showOrderDetails();
        
        System.out.println("--------------------------------");
        
        double baseAmount = order.getProduct().getPrice() * order.getQuantity();
        double finalAmount = billService.calculateTotal(order);
        
        double taxAmount = baseAmount * (18.0 / 100);     // Hardcoded for display
        double discountAmount = baseAmount * (10.0 / 100);
        
        System.out.println("Base Amount: ₹" + String.format("%.2f", baseAmount));
        System.out.println("Tax (18%): ₹" + String.format("%.2f", taxAmount));
        System.out.println("Discount (10%): ₹" + String.format("%.2f", discountAmount));
        System.out.println("--------------------------------");
        System.out.println("Final Bill: ₹" + String.format("%.2f", finalAmount));
        System.out.println("Thank you for shopping with us!");
    }
}