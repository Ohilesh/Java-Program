class StationaryRunner 
{
    public static void main(String[] args) 
	{
        // Creating an instance of the Stationary class
		
        Stationary stationary = new Stationary();

        // Set values to the instance variables
		
        stationary.itemName = "Notebook";
        stationary.quantity = 50;
        stationary.price = 45.55;
        stationary.isAvailable = true;
        stationary.size = 'M';  // Medium-sized notebook
        stationary.productCode = 9876543210l;
        stationary.weight = 0.5f;

        // Display the stationary item's information
        stationary.display();
    }
}
