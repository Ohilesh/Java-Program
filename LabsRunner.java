class LabsRunner 
{
    public static void main(String[] args)
	{
        // Create a Labs insatnce
		
        Labs physicsLab = new Labs("Physics Lab", 5, 100000.50, true, 'A', 464645415l, 1250.0f);

        // Display the values using getter methods
		
        System.out.println("Lab Name: " + physicsLab.getLabName());
        System.out.println("Number of Rooms: " + physicsLab.getNumberOfRooms());
        System.out.println("Equipment Cost: " + physicsLab.getEquipmentCost());
        System.out.println("Is Certified: " + physicsLab.getIsCertified());
        System.out.println("Safety Grade: " + physicsLab.getSafetyGrade());
        System.out.println("Lab ID: " + physicsLab.getLabId());
        System.out.println("Area (sqm): " + physicsLab.getArea());
    }
}
