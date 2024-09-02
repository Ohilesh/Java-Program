class HillRunner
 {
    public static void main(String[] args) 
	{
        // Setting values for the hill
        Hill.setHeightOfHill(5500);
        Hill.setNameOfHill("Mount K2");
        Hill.setIsActive(true); // Setting the hill as active

        // Displaying the hill details
        Hill.display();
    }
}
