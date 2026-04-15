package com.newyearalert;

//Question 3: New Year Alert – Spring Core (XML Configuration)
//A YearService bean contains a method getMonth() that returns the current month name.
//
//Using Spring XML configuration:
//If the month is "January", print "Happy New Year!"
//For all other months, print "Regular month."

import java.time.LocalDate;
import java.time.Month;

public class NewYearAlert {
    private LocalDate currentDate;

    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }
    
    public void newYearAlert() {
        if (currentDate == null) {
            System.out.println("Date is not set!");
            return;
        }
        
        Month month = currentDate.getMonth();
        
        // Compare with Month.JANUARY enum constant
        if (month == Month.JANUARY) {
            System.out.println("Happy New Year!");
        } else {
            System.out.println("Regular month.");
        }
    }
}