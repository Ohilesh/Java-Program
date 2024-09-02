class DumbbellsRunner 
{
    public static void main(String[] args) 
	{
        // Setting values for the Dumbbells class and getting the returned values
        Dumbbells.setWeight(10.5f);
        Dumbbells.setMaterial('M');
        Dumbbells.setHandleLength(12.3);
        Dumbbells.setColor("Black");
        Dumbbells.setIsAdjustable(true);

        // Displaying the Dumbbells details using getter methods
        System.out.println("Weight of the dumbbells: " + Dumbbells.getWeight() + " kg");
        System.out.println("Material of the dumbbells: " + Dumbbells.getMaterial());
        System.out.println("Handle length of the dumbbells: " + Dumbbells.getHandleLength() + " cm");
        System.out.println("Color of the dumbbells: " + Dumbbells.getColor());
        System.out.println("Are the dumbbells adjustable? " + Dumbbells.getIsAdjustable());
    }
}
