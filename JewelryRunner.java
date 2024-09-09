class JewelryRunner 
{
    public static void main(String[] args)
	{
        // Setting values using setter methods
        Jewelry.setQualityRating('A');
        Jewelry.setYearManufactured((short) 2020);
        Jewelry.setPrice(3000);
        Jewelry.setSerialNumber(987654321012345L);
        Jewelry.setCaratWeight(2.5f);
        Jewelry.setWeight(50.0);
        Jewelry.setIsAntique(true);

        // Getting values using getter methods and printing them
        System.out.println("Quality Rating: " + Jewelry.getQualityRating());
        System.out.println("Year Manufactured: " + Jewelry.getYearManufactured());
        System.out.println("Price: $" + Jewelry.getPrice());
        System.out.println("Serial Number: " + Jewelry.getSerialNumber());
        System.out.println("Carat Weight: " + Jewelry.getCaratWeight() + " carats");
        System.out.println("Weight: " + Jewelry.getWeight() + " grams");
        System.out.println("Antique: " + Jewelry.getAntique());
    }
}
