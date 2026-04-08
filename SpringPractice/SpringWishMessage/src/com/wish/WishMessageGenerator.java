package com.wish;

import java.time.LocalDateTime;

public class WishMessageGenerator {

    private LocalDateTime currentDateTime;

    // Setter method for Dependency Injection (Required)
    public void setCurrentDateTime(LocalDateTime currentDateTime) {
        this.currentDateTime = currentDateTime;
    }

    public void generateWishMessage() {
        if (currentDateTime == null) {
            System.out.println("DateTime is not set!");
            return;
        }

        int hour = currentDateTime.getHour();

        String wishMessage;

        if (hour < 12) {
            wishMessage = "Good Morning";
        } else if (hour < 18) {   // 12 PM to 5:59 PM
            wishMessage = "Good Afternoon";
        } else {
            wishMessage = "Good Evening";   // 6 PM onwards
        }

        System.out.println(wishMessage);
    }
}