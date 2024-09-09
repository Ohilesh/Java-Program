class Lipstick 
{
    // Instance variables using wrapper classes
	
    Integer shadeNumber;
    Double price;
    Boolean isMatte;
    Character brandSize;
    Byte longevity;
    Short weight;
    Long serialNumber;

    // Method to display the lipstick details
	
    void displayDetails() 
	{
        System.out.println("Shade Number: " + shadeNumber);
        System.out.println("Price: " + price);
        System.out.println("Is Matte Finish: " + isMatte);
        System.out.println("Brand Size: " + brandSize);
        System.out.println("Longevity in Hours: " + longevity);
        System.out.println("Weight in grams: " + weight);
        System.out.println("Serial Number: " + serialNumber);
    }
}

