package com.vehicle;

public class Car {
    
    private Engine engine;

    // Constructor Injection
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void displayCarDetails() {
        System.out.println("Car is running with " + engine.getEngineType() + " Engine");
    }
}