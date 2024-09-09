class WatchRunner 
{
    public static void main(String[] args) 
	{
        // Setting values using setter methods
        Watch.setBrandInitial('R');
        Watch.setYearManufactured((short) 2021);
        Watch.setModelNumber(123456);
        Watch.setSerialNumber(987654321012345L);
        Watch.setCaseDiameter(42.5f);
        Watch.setWeight(150.0);
        Watch.setIsWaterResistant(true);

        // Getting values using getter methods and printing them
        System.out.println("Brand Initial: " + Watch.getBrandInitial());
        System.out.println("Year Manufactured: " + Watch.getYearManufactured());
        System.out.println("Model Number: " + Watch.getModelNumber());
        System.out.println("Serial Number: " + Watch.getSerialNumber());
        System.out.println("Case Diameter: " + Watch.getCaseDiameter() + " mm");
        System.out.println("Weight: " + Watch.getWeight() + " grams");
        System.out.println("Water Resistant: " + Watch.getWaterResistant());
    }
}
