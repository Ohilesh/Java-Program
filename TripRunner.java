class TripRunner 
{
    public static void main(String[] args) {
        
		// Setting values for static variables in Trip class
        Trip.setNumOfDays(5);
        Trip.setTotalCost(5234.50);
        Trip.setDestination("Thailand");
        Trip.setIsAvailable(true);

        // Displaying the values of static variables
        Trip.display();
    }
}
