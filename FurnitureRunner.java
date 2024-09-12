class FurnitureRunner
 {
    public static void main(String[] args)
	{
        // Create a Furniture instance
		
        Furniture chair = new Furniture("Chair", 10, 2500.75, true, 'A', 645465244L, 20.5f);

        // Display the values using getter methods
		
        System.out.println("Type: " + chair.getType());
        System.out.println("Quantity: " + chair.getQuantity());
        System.out.println("Price: " + chair.getPrice());
        System.out.println("Assembled: " + chair.getIsAssembled());
        System.out.println("Material Grade: " + chair.getMaterialGrade());
        System.out.println("Item ID: " + chair.getItemId());
        System.out.println("Discount: " + chair.getDiscount());
    }
}
