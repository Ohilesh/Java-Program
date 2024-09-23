package com.xworkz.skin.boot;

public class Sunscreen {
    
    private String brand;
    private double spf;
    private boolean isWaterResistant;
    private String applicationType; // e.g., lotion, spray, cream

    // Constructor
    public Sunscreen(String brand, double spf, boolean isWaterResistant, String applicationType) {
        this.brand = brand;
        this.spf = spf;
        this.isWaterResistant = isWaterResistant;
        this.applicationType = applicationType;
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpf() {
        return spf;
    }

    public void setSpf(double spf) {
        this.spf = spf;
    }

    public boolean isWaterResistant() {
        return isWaterResistant;
    }

    public void setWaterResistant(boolean isWaterResistant) {
        this.isWaterResistant = isWaterResistant;
    }

    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }
}
