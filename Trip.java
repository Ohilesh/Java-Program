class Trip
 {

    // Static variables
    static int numOfDays;
    static double totalCost;
    static String destination;
    static boolean isAvailable;

    // Setter methods for static variables
    public static void setNumOfDays(int days) 
	{
        numOfDays = days;
    }

    public static void setTotalCost(double cost)
	{
        totalCost = cost;
    }

    public static void setDestination(String dest)
	{
        destination = dest;
    }

    public static void setIsAvailable(boolean available) 
	{
        isAvailable = available;
    }

    // Method to display the values of static variables
    public static void display()
	{
        System.out.println("Number of days for the trip: " + numOfDays);
        System.out.println("Total cost of the trip: " + totalCost);
        System.out.println("Destination of the trip: " + destination);
        System.out.println("Is the trip available? " + isAvailable);
    }
}
