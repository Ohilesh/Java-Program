package com.xworkz.stationery.boot;

public class Pencil {
    
    private String brand;
    private String type; // e.g., HB, 2B, etc.
    private double price;
    private boolean isSharpened;

    public Pencil(String brand, String type, double price, boolean isSharpened) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.isSharpened = isSharpened;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isSharpened() {
        return isSharpened;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSharpened(boolean isSharpened) {
        this.isSharpened = isSharpened;
    }
}
