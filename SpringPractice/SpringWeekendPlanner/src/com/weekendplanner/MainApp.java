package com.weekendplanner;

//Question 1: Weekend Planner – Spring Core (XML Configuration)
//===============================================================
//It's Saturday, and your app should print whether it's a weekend or a weekday. You have a DateService class with a method getDayOfWeek() that returns the current day.
//
//
//How would you configure a Spring Core application using XML, where the DateService bean automatically detects the day, and:
//
//Prints "It's the Weekend!" if it's Saturday or Sunday.
//
//Prints "It's a Weekday." otherwise.

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        WeekendPlanner weekendPlanner = (WeekendPlanner) context.getBean("weekendplanner");

        weekendPlanner.checkDay();
    }
}