package com.monthendremainder;

//Question 2: Month-End Reminder – Spring Core (XML Configuration)
//====================================================================
//You’ve built a bean CalendarService with a method getDate() that returns the current day of the month.
//
//Using Spring Core (XML), write a scenario where:
//
//If it’s the 30th or 31st, print "Month is ending, please submit reports."
//
//Otherwise, print "Continue working as usual."

import java.time.LocalDate;

public class MonthEndRemainder {

    private LocalDate currentDate;

    // Setter for Dependency Injection
    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }

    public void monthEndRemainder() {
        if (currentDate == null) {
            System.out.println("Date is not set!");
            return;
        }

        int dayOfMonth = currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();
        int year = currentDate.getYear();
        
        System.out.println("Current Date: " + currentDate);
        System.out.println("Day of Month: " + dayOfMonth);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);

        // Check if it's 30th or 31st
        if (dayOfMonth == 30 || dayOfMonth == 31) {
            System.out.println("Month is ending, please submit reports.");
        } else {
            System.out.println("Continue working as usual...");
        }
    }
}