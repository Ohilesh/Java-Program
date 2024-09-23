package com.xworkz.skin.runner;

import com.xworkz.skin.boot.Sunscreen;
import com.xworkz.skin.boot.Moisturizer;

public class SunscreenRunner {
    
    public static void main(String[] args) {
        
        // Create an instance of Sunscreen
        Sunscreen sunscreen = new Sunscreen("Neutrogena", 50.0, true, "Lotion");
        
        // Create an instance of Moisturizer
        Moisturizer moisturizer = new Moisturizer("Cetaphil", "dry", true, "Cream");
        
        // Print Sunscreen details
        System.out.println("Sunscreen Details:");
        System.out.println("Brand: " + sunscreen.getBrand());
        System.out.println("SPF: " + sunscreen.getSpf());
        System.out.println("Water Resistant: " + sunscreen.isWaterResistant());
        System.out.println("Application Type: " + sunscreen.getApplicationType());
        
        // Print Moisturizer details
        System.out.println("\nMoisturizer Details:");
        System.out.println("Brand: " + moisturizer.getBrand());
        System.out.println("Skin Type: " + moisturizer.getSkinType());
        System.out.println("Contains SPF: " + moisturizer.isContainsSPF());
        System.out.println("Texture: " + moisturizer.getTexture());
    }
}
