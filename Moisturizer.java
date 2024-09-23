package com.xworkz.skin.boot;

public class Moisturizer {
    
    private String brand;
    private String skinType; // e.g., dry, oily, combination
    private boolean containsSPF;
    private String texture; // e.g., cream, gel

    // Constructor
    public Moisturizer(String brand, String skinType, boolean containsSPF, String texture) {
        this.brand = brand;
        this.skinType = skinType;
        this.containsSPF = containsSPF;
        this.texture = texture;
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSkinType() {
        return skinType;
    }

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    public boolean isContainsSPF() {
        return containsSPF;
    }

    public void setContainsSPF(boolean containsSPF) {
        this.containsSPF = containsSPF;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }
}
