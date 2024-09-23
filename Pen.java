package com.xworkz.stationery.boot;

public class Pen {
    
    private String brand;
    private String color;
    private double price;
    private boolean isRefillable;

    public Pen(String brand, String color, double price, boolean isRefillable) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.isRefillable = isRefillable;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public boolean isRefillable() {
        return isRefillable;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRefillable(boolean isRefillable) {
        this.isRefillable = isRefillable;
    }
}
