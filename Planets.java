package com.xworkz.space.boot;

public class Planets 
{
	
	// Instance variables
	public String planetName;  
	public double mass;        
	public double radius;      
	public double distanceFromSun; 
	public boolean hasLife;    
	
	// Reference to a Stars instance
	
	public Stars star; 
	
	// Getter and Setter methods for each field
	
	public String getPlanetName() {
		return planetName;
	}
	
	public void setPlanetName(String planetName) {
		this.planetName = planetName;
	}
	
	public double getMass() {
		return mass;
	}
	
	public void setMass(double mass) {
		this.mass = mass;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getDistanceFromSun() {
		return distanceFromSun;
	}
	
	public void setDistanceFromSun(double distanceFromSun) {
		this.distanceFromSun = distanceFromSun;
	}
	
	public boolean hasLife() {
		return hasLife;
	}
	
	public void setHasLife(boolean hasLife) {
		this.hasLife = hasLife;
	}
	
	public Stars getStar() {
		return star;
	}
	
	public void setStar(Stars star) {
		this.star = star;
	}
}
