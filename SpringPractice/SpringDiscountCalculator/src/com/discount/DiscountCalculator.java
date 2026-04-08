package com.discount;

import java.time.LocalDate;
import java.time.DayOfWeek;

public class DiscountCalculator {

    private LocalDate currentDate;
    private double price;

    // Setter for Dependency Injection
    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void calculateDiscount() {
        if (currentDate == null) {
            System.out.println("Current date is not set!");
            return;
        }

        DayOfWeek day = currentDate.getDayOfWeek();
        double discountRate = 0.0;

        // 10% on Weekdays (Mon - Fri), 20% on Weekend (Sat - Sun)
        if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
            discountRate = 0.20;   // 20% weekend discount
            System.out.println("Weekend detected - 20% discount applied");
        } else {
            discountRate = 0.10;   // 10% weekday discount
            System.out.println("Weekday detected - 10% discount applied");
        }

        double discountedPrice = price - (price * discountRate);

        System.out.println("Original Price     : " + price);
        System.out.println("Discounted Price   : " + discountedPrice);
        System.out.println("Discount Applied   : " + (discountRate * 100) + "%");
    }
}