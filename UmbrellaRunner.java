class UmbrellaRunner
 {
    public static void main(String[] args) 
	{
        // Setting values for the Umbrella class and getting the returned values
       Umbrella.setColor("Red");
       Umbrella.setSizeInInches(42);
       Umbrella.setMaterial("Polyester");
       Umbrella.setIsAutomatic(true);
       Umbrella.setWindResistanceLevel(8);

        // Displaying the Umbrella details using getter methods
        System.out.println("Color of the umbrella: " + Umbrella.getColor());
        System.out.println("Size of the umbrella: " + Umbrella.getSizeInInches() + " inches");
        System.out.println("Material of the umbrella: " + Umbrella.getMaterial());
        System.out.println("Is the umbrella automatic? " + Umbrella.getIsAutomatic());
        System.out.println("Wind resistance level of the umbrella: " + Umbrella.getWindResistanceLevel());
    }
}
