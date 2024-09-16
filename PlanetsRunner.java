package com.xworkz.space.boot;

public class PlanetsRunner
 {
	
	public static void main(String[] args)
	{
		
		// Creating an instance of Stars and setting its properties
		
		Stars star = new Stars();
		star.setStarName("Sun");
		star.setStarType("G-type Main-sequence Star");
		star.setStarMass(1.0); 
		star.setLuminosity(1.0); 
		
		// Creating an instance of Planets and setting its properties
		
		Planets planet = new Planets();
		planet.setPlanetName("Earth");
		planet.setMass(1.0); 
		planet.setRadius(6371); 
		planet.setDistanceFromSun(149.6); // Distance from Sun in million km
		planet.setHasLife(true); 
		
		// Linking the Planets object to the Stars object
		
		planet.setStar(star);
		
		// Retrieving and displaying the Planet details along with the Star information
		
		System.out.println("Planet Name: " + planet.getPlanetName());
		System.out.println("Mass: " + planet.getMass() + " Earth masses");
		System.out.println("Radius: " + planet.getRadius() + " km");
		System.out.println("Distance from Sun: " + planet.getDistanceFromSun() + " million km");
		System.out.println("Has Life: " + planet.hasLife());
		
		// Displaying Star details
		
		System.out.println("Star Name: " + planet.getStar().getStarName());
		System.out.println("Star Type: " + planet.getStar().getStarType());
		System.out.println("Star Mass: " + planet.getStar().getStarMass() + " Solar masses");
		System.out.println("Luminosity: " + planet.getStar().getLuminosity() + " Solar luminosities");
	}
}
