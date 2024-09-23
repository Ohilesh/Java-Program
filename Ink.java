package com.xworkz.stationery.boot;

public class Ink {
    
    private String color;
    private double volume; // in milliliters
    private String brand;
    private boolean isWaterproof;

    public Ink(String color, double volume, String brand, boolean isWaterproof) {
        this.color = color;
        this.volume = volume;
        this.brand = brand;
        this.isWaterproof = isWaterproof;
    }

    public String getColor() {
        return color;
    }

    public double getVolume() {
        return volume;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isWaterproof() {
        return isWaterproof;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWaterproof(boolean isWaterproof) {
        this.isWaterproof = isWaterproof;
    }
}
