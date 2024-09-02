class WashingMachineRunner 
{
    public static void main(String[] args) 
	{
        // Setting values for the WashingMachine class and getting the returned values
        WashingMachine.setBrand("Samsung");
        WashingMachine.setDrumCapacity(8);
        WashingMachine.setType("Front Load");
        WashingMachine.setIsEnergyEfficient(true);
        WashingMachine.setSpinSpeed(1400);

        // Displaying the WashingMachine details using getter methods
        System.out.println("Brand of the washing machine: " + WashingMachine.getBrand());
        System.out.println("Drum capacity of the washing machine: " + WashingMachine.getDrumCapacity() + " liters");
        System.out.println("Type of the washing machine: " + WashingMachine.getType());
        System.out.println("Is the washing machine energy efficient? " + WashingMachine.getIsEnergyEfficient());
        System.out.println("Spin speed of the washing machine: " + WashingMachine.getSpinSpeed() + " RPM");
    }
}
