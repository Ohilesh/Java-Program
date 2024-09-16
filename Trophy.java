package com.xworkz.sports.boot;

public class Trophy 
{
	
	// Instance variables
	public String trophyName;  
	public String material;    
	public double height;      
	public double weight;      
	public int year;           
	public boolean isHistoric; 
	
	// Reference to a Champion object
	
	public Champion champion; 
	
	// Getter and Setter methods for each field
	
	public String getTrophyName() {
		return trophyName;
	}
	
	public void setTrophyName(String trophyName) {
		this.trophyName = trophyName;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public boolean isHistoric() {
		return isHistoric;
	}
	
	public void setHistoric(boolean isHistoric) {
		this.isHistoric = isHistoric;
	}
	
	public Champion getChampion() {
		return champion;
	}
	
	public void setChampion(Champion champion) {
		this.champion = champion;
	}
}
