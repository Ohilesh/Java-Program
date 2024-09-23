package com.xworkz.clothing;

public class Pullover {
    public String brand;
    public String size;
    public String material;

    public Pullover(String brand, String size, String material) {
        super();
        this.brand = brand;
        this.size = size;
        this.material = material;
    }

    public String getBrand() {
        return brand;
    }

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
