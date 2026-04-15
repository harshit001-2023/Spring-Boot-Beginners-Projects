package com.weekendplanner;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekendPlanner {

    private LocalDate currentDate;

    // Setter for Dependency Injection (Required by the question)
    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }

    public void checkDay() {
        if (currentDate == null) {
            System.out.println("Date is not set!");
            return;
        }

        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();

        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
            System.out.println("It's the Weekend!");
        } else {
            System.out.println("It's a Weekday.");
        }
    }
}