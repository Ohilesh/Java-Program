class NosepinRunner
 {
    public static void main(String[] args) 
	{
        // Create an instance of the Nosepin class
		
        Nosepin nosepin = new Nosepin();

        // Set values to the instance variables
		
        nosepin.material = "Gold";
        nosepin.quantity = 50;
        nosepin.price = 9299.99;
        nosepin.isAvailable = true;
        nosepin.size = 'M';  // Medium size nosepin
        nosepin.productCode = 866655532866L;
        nosepin.weight = 1.5f;  // Weight in grams

        // Display the nosepin's information
		
        nosepin.display();
    }
}
