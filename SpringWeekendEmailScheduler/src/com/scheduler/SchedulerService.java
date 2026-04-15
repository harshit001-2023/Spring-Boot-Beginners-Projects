package com.scheduler;

//Question 5: Weekend Email Scheduler – Spring Core (XML Configuration)
//=============================================================================
//You have a SchedulerService bean with a method getDay() returning the current day of the week.
//
//How would you configure your application so that:
//
//If it’s "Friday", print "Schedule weekly report email."
//
//If it’s "Monday", print "Check weekend system logs."
//
//Otherwise, print "Normal weekday operations."

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SchedulerService {

    private LocalDate currentDate;

    // Setter method for Dependency Injection
    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }

    public void getDay() {
        if (currentDate == null) {
            System.out.println("Date is not set!");
            return;
        }

        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();

        if (dayOfWeek == DayOfWeek.FRIDAY) {
            System.out.println("Schedule weekly report email.");
        } 
        else if (dayOfWeek == DayOfWeek.MONDAY) {
            System.out.println("Check weekend system logs.");
        } 
        else {
            System.out.println("Normal weekday operations.");
        }
    }
}
