package com.xworkz.sports.boot;

public class TrophyRunner 
{
	
	public static void main(String[] args) {
		
		// Creating an instance of Champion and setting its properties
		
		Champion champion = new Champion();
		champion.setChampionName("Usain Bolt");
		champion.setNationality("Jamaican");
		champion.setAge(35);
		champion.setTotalTitles(8);
		
		// Creating an instance of Trophy and setting its properties
		
		Trophy trophy = new Trophy();
		trophy.setTrophyName("Olympic Gold Medal");
		trophy.setMaterial("Gold");
		trophy.setHeight(12.5);
		trophy.setWeight(0.5);
		trophy.setYear(2016);
		trophy.setHistoric(true);
		
		// Linking the Trophy object to the Champion
		
		trophy.setChampion(champion);
		
		// Retrieving and displaying the Trophy details along with the Champion information
		
		System.out.println("Trophy Name: " + trophy.getTrophyName());
		System.out.println("Material: " + trophy.getMaterial());
		System.out.println("Height: " + trophy.getHeight() + " cm");
		System.out.println("Weight: " + trophy.getWeight() + " kg");
		System.out.println("Year: " + trophy.getYear());
		System.out.println("Is Historic: " + trophy.isHistoric());
		
		// Displaying Champion details
		
		System.out.println("Champion Name: " + trophy.getChampion().getChampionName());
		System.out.println("Nationality: " + trophy.getChampion().getNationality());
		System.out.println("Age: " + trophy.getChampion().getAge());
		System.out.println("Total Titles: " + trophy.getChampion().getTotalTitles());
	}
}
