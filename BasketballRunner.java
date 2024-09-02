class BasketballRunner 
{
    public static void main(String[] args) 
	{
        // Setting values for the Basketball class and getting the returned values
        Basketball.setDiameter(24.5);
        Basketball.setBrand("Nike");
        Basketball.setWeight(0.625f);
        Basketball.setIsInflated(true);
        Basketball.setReleaseYear(1998);

        // Displaying the Basketball details using getter methods
        System.out.println("Basketball diameter: " + Basketball.getDiameter() + " cm");
        System.out.println("Basketball brand: " + Basketball.getBrand());
        System.out.println("Basketball weight: " + Basketball.getWeight() + " kg");
        System.out.println("Is the basketball inflated? " + Basketball.getIsInflated());
        System.out.println("Release year of the basketball: " + Basketball.getReleaseYear());
    }
}
