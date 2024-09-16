package com.xworkz.sports.boot;

public class Champion 
{
	
	// Instance variables
	public String championName; 
	public String nationality;  
	public int age;             
	public int totalTitles;     
	
	// Getter and Setter methods for each field
	
	public String getChampionName() {
		return championName;
	}
	
	public void setChampionName(String championName) {
		this.championName = championName;
	}
	
	public String getNationality() {
		return nationality;
	}
	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getTotalTitles() {
		return totalTitles;
	}
	
	public void setTotalTitles(int totalTitles) {
		this.totalTitles = totalTitles;
	}
}
