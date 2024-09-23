package com.xworkz.skin.boot;

public class Facepack extends Moisturizer {

    // Constructor
    public Facepack(String brand, double hydrationLevel, boolean isNonComedogenic) {
        super(brand, hydrationLevel, isNonComedogenic); // Call to the parent constructor
    }

    // Overridden methods
    @Override
    public String getBrand() {
        return "Facepack Brand: " + super.getBrand(); // Custom message
    }

    @Override
    public double getHydrationLevel() {
        return super.getHydrationLevel() + 10.0; // Example modification
    }

    @Override
    public boolean isNonComedogenic() {
        return !super.isNonComedogenic(); // Negating the parent value
    }

    @Override
    public String toString() {
        return "Facepack [Brand: " + getBrand() + 
               ", Hydration Level: " + getHydrationLevel() + 
               ", Non-Comedogenic: " + isNonComedogenic() + "]";
    }
}
