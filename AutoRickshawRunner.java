class AutoRickshawRunner 
{
    public static void main(String[] args)
	{
        // Create an AutoRickshaw object
		
        AutoRickshaw rickshaw = new AutoRickshaw("Bajaj ", 3, 8.5, false, 'C', 03047119L, 45.5f);

        // Display the values using getter methods
		
        System.out.println("Model: " + rickshaw.getModel());
        System.out.println("Seating Capacity: " + rickshaw.getSeatingCapacity());
        System.out.println("Fare per Km: " + rickshaw.getFarePerKm());
        System.out.println("Is Electric: " + rickshaw.getIsElectric());
        System.out.println("Fuel Type: " + rickshaw.getFuelType());
        System.out.println("Registration Number: " + rickshaw.getRegistrationNumber());
        System.out.println("Mileage: " + rickshaw.getMileage());
    }
}
