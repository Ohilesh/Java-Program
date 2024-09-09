class LipstickRunner
 {
    public static void main(String[] args)
	{
        // Creating an instance of the Lipstick class and initializing the instance variables
		
        Lipstick lipstick = new Lipstick();
		
        lipstick.shadeNumber = 101;
        lipstick.price = 1500.99;
        lipstick.isMatte = true;
        lipstick.brandSize = 'L';
        lipstick.longevity = 8;
        lipstick.weight = 50;
        lipstick.serialNumber = 884515451545454L;

        // Displaying the lipstick details
		
        lipstick.displayDetails();
    }
}
