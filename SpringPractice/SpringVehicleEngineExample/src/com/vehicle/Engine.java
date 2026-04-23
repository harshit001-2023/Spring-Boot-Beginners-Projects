package com.vehicle;

public class Engine {
    
    private String engineType;

    // Constructor for Constructor Injection
    public Engine(String engineType) {
        this.engineType = engineType;
    }

    public void showEngineType() {
        System.out.println("Engine Type: " + engineType);
    }

    // Getter (optional but good practice)
    public String getEngineType() {
        return engineType;
    }
}