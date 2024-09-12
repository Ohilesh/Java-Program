class NailPolishRunner 
{
    public static void main(String[] args)
	{
        // Create a NailPolish instance
		
        NailPolish polish = new NailPolish("Red", 5, 120.99, true, 'M', 987654320l, 20.0f);

        // Display the values using getter methods
		
        System.out.println("Color: " + polish.getColor());
        System.out.println("Quantity: " + polish.getQuantity());
        System.out.println("Price: " + polish.getPrice());
        System.out.println("Is Gel: " + polish.getIsGel());
        System.out.println("Finish: " + polish.getFinish());
        System.out.println("Batch Number: " + polish.getBatchNumber());
        System.out.println("Discount: " + polish.getDiscount());
    }
}
