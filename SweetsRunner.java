class SweetsRunner
 {
    public static void main(String[] args)
	{
        // Creating an instance of the Sweets class
		
        Sweets sweet = new Sweets();

        // Set values to the instance variables
		
        sweet.sweetName = "Gulab Jamun";
        sweet.quantity = 100;
        sweet.pricePerKg = 150.99;
        sweet.isAvailable = true;
        sweet.size = 'M';  // Medium size
        sweet.batchCode = 445465471298l;
        sweet.weight = 0.25f;  

        // Display the sweets information
		
        sweet.displayInfo();
    }
}
