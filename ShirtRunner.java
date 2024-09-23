package com.xworkz.clothing;

public class ShirtRunner {
    public static void main(String[] args) {
        Pant pant = new Pant("Levi's", "Denim", "Slim fit");
        Shirt shirt = new Shirt("Zara", "M", "Blue", pant);
        Pullover pullover = new Pullover("H&M", "L", "Wool");

        // Display Shirt details
        System.out.println("Shirt brand: " + shirt.getBrand());
        System.out.println("Shirt size: " + shirt.getSize());
        System.out.println("Shirt color: " + shirt.getColor());
        System.out.println("Matching Pant brand: " + shirt.getPant().getBrand());

        // Display Pullover details
        System.out.println("Pullover brand: " + pullover.getBrand());
        System.out.println("Pullover size: " + pullover.getSize());
        System.out.println("Pullover material: " + pullover.getMaterial());
    }
}
