class WireRunner 
{
    public static void main(String[] args) 
	{
        // Create a Wire instance
		
        Wire copperWire = new Wire("Copper", 50, 1.25, true, 'A', 546451454L, 3.5f);
		

        // Display the values using getter methods
		
        System.out.println("Material: " + copperWire.getMaterial());
        System.out.println("Length (m): " + copperWire.getLength());
        System.out.println("Resistance (ohms): " + copperWire.getResistance());
        System.out.println("Is Insulated: " + copperWire.getIsInsulated());
        System.out.println("Grade: " + copperWire.getGrade());
        System.out.println("Serial Number: " + copperWire.getSerialNumber());
        System.out.println("Thickness (mm): " + copperWire.getThickness());
    }
}
