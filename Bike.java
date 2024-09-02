class Bike {
	public static void bikeCompany(String bikeBrand)
	{
        bikeBrand = "Royal Enfield"; 
        System.out.println("The Name of the Bike brand is: " + bikeBrand);
    }

    public static String nameOfBikes(String bikeOne, String bikeTwo, String bikeThree)
	{
        return bikeOne + ", " + bikeTwo + ", " + bikeThree;
    }

    public static String bikePrice(float bikeOne, float bikeTwo, float bikeThree)
	{
        return "$" + bikeOne + ", $" + bikeTwo + ", $" + bikeThree;
    }

    public static int customers(int numOfCustomers) 
	{
        return numOfCustomers;  
    }

    public static String engine(int cc, int maxRpm)
	{
        return cc + "cc, " + maxRpm + " RPM";
    }

    public static int mileage(int mileageBikeOne, int mileageBikeTwo, int mileageBikeThree)
	{
        return mileageBikeOne; 
    }

    public static int totalNumOfCustomers(int bikeOne, int bikeTwo, int bikeThree)
	{
        return bikeOne + bikeTwo + bikeThree;
    }
	
    public static String contact(long contactNumOne, long contactNumTwo, long contactNumThree)
	{
        return contactNumOne + ", " + contactNumTwo + ", " + contactNumThree;
    }

    public static String features(String featureOne, String featureTwo, String featureThree)
	{
        return featureOne + ", " + featureTwo + ", " + featureThree;
    }
}








