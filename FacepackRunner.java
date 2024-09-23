package com.xworkz.skin.runner;

import com.xworkz.skin.boot.Facepack;

public class FacepackRunner {
    
    public static void main(String[] args) {
        
        // Create an instance of Facepack
        Facepack facepack = new Facepack("L'Oreal", 60.0, true);
        
        // Print Facepack details
        System.out.println(facepack.toString());
        
        // Demonstrating the overridden getBrand method
        System.out.println("Brand (Overridden): " + facepack.getBrand());
    }
}
