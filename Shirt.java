package com.xworkz.clothing;

public class Shirt {
    public String brand;
    public String size;
    public String color;
    public Pant pant;  // Association with Pant

    public Shirt(String brand, String size, String color, Pant pant) {
        super();
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.pant = pant;
    }

    public String getBrand() {
        return brand;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public Pant getPant() {
        return pant;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPant(Pant pant) {
        this.pant = pant;
    }
}
