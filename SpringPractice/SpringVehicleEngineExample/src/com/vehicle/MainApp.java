package com.vehicle;

//Spring Core Constructor Injection — Task 1
//🎯 Task Name: Vehicle Engine Example
//🧱 Objective:
//
//Demonstrate constructor-based dependency injection between two classes (Car and Engine).
//
//📘 Classes:
//🔹 Class 1 — Engine
//
//Fields: engineType (String)
//
//Constructor: to initialize engineType
//
//Method: showEngineType() → prints engine type.
//
//🔹 Class 2 — Car
//
//Field: engine (of type Engine)
//
//Constructor: to inject the Engine dependency.
//
//Method: displayCarDetails() → prints "Car is running with {engineType} engine".
//
//🔹 Configuration
//
//Use XML (<constructor-arg>).
//
//Create bean definitions for both Engine and Car.
//
//🔹 Main Class — TestApp
//
//Load Spring container.
//
//Retrieve Car bean.
//
//Call displayCarDetails().
//
//✅ Expected Output:
//Car is running with Diesel Engine

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    
    public static void main(String[] args) {
        
        // Load Spring Application Context
        @SuppressWarnings("resource")
		ApplicationContext context = 
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get Car bean
        Car car = (Car) context.getBean("car");

        // Call method
        car.displayCarDetails();
    }
}
