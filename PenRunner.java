package com.xworkz.stationery.runner;

import com.xworkz.stationery.boot.Pen;
import com.xworkz.stationery.boot.Pencil;
import com.xworkz.stationery.boot.Ink;

public class PenRunner {
    
    public static void main(String[] args) {
        Pen pen = new Pen("Parker", "Blue", 15.99, true);
        Pencil pencil = new Pencil("Faber-Castell", "HB", 1.99, true);
        Ink ink = new Ink("Black", 50.0, "Pilot", false);

        System.out.println("Pen Details:");
        System.out.println("Brand: " + pen.getBrand());
        System.out.println("Color: " + pen.getColor());
        System.out.println("Price: $" + pen.getPrice());
        System.out.println("Refillable: " + pen.isRefillable());

        System.out.println("\nPencil Details:");
        System.out.println("Brand: " + pencil.getBrand());
        System.out.println("Type: " + pencil.getType());
        System.out.println("Price: $" + pencil.getPrice());
        System.out.println("Is Sharpened: " + pencil.isSharpened());

        System.out.println("\nInk Details:");
        System.out.println("Color: " + ink.getColor());
        System.out.println("Volume: " + ink.getVolume() + "ml");
        System.out.println("Brand: " + ink.getBrand());
        System.out.println("Waterproof: " + ink.isWaterproof());
    }
}
