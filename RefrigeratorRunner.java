class RefrigeratorRunner
 {
    public static void main(String[] args)
	{
        // Setting values using setter methods
        Refrigerator.setEnergyGrade('A');
        Refrigerator.setModelYear((short) 2022);
        Refrigerator.setPrice(120000);
        Refrigerator.setSerialNumber(123456789012345l);
        Refrigerator.setPowerConsumption(350.5f);
        Refrigerator.setWeight(75.8);
        Refrigerator.setIsSmart(true);

        // Getting values using getter methods and printing them
        System.out.println("Energy Grade: " + Refrigerator.getEnergyGrade());
        System.out.println("Model Year: " + Refrigerator.getModelYear());
        System.out.println("Price: " + Refrigerator.getPrice());
        System.out.println("Serial Number: " + Refrigerator.getSerialNumber());
        System.out.println("Power Consumption: " + Refrigerator.getPowerConsumption() + " kWh");
        System.out.println("Weight: " + Refrigerator.getWeight() + " kg");
        System.out.println("Smart Refrigerator: " + Refrigerator.getSmart());
    }
}
