class Sweets 
{
    // Instance variables 
	
    String sweetName;         
    int quantity;             
    double pricePerKg;         
    boolean isAvailable;      
    char size;                 
    long batchCode;         
    float weight;              

    // Method to display the sweets information
	
    public void display() 
	{
        System.out.println("Sweet Name: " + sweetName);
        System.out.println("Quantity Available: " + quantity + " pieces");
        System.out.println("Price per Kg: " + pricePerKg);
        System.out.println("Is Available: " + isAvailable);
        System.out.println("Size: " + size);
        System.out.println("Batch Code: " + batchCode);
        System.out.println("Weight per 10 pieces: " + weight + " kg");
    }
}
