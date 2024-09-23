package com.xworkz.clothing;

public class Pant {
    public String brand;
    public String material;
    public String fit;

    public Pant(String brand, String material, String fit) {
        super();
        this.brand = brand;
        this.material = material;
        this.fit = fit;
    }

    public String getBrand() {
        return brand;
    }

    public String getMaterial() {
        return material;
    }

    public String getFit() {
        return fit;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setFit(String fit) {
        this.fit = fit;
    }
}
