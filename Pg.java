class Pg
 {

    // Static variables
    static int numOfFloors;
    static int pricePerMonth;

    // Setter methods for static variables
    public static void setNumOfFloors(int floors)
	{
        numOfFloors = floors;
    }

    public static void setPricePerMonth(int price) 
	{
        pricePerMonth = price;
    }

    // Method to display the values of static variables
    public static void display()
	{
        System.out.println("Number of floors in Pg: " + numOfFloors);
        System.out.println("Price per month in Pg: " + pricePerMonth);
    }
}
