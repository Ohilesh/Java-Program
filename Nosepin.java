class Nosepin 
 {
    // Instance variables 
    String material;          
    int quantity;             
    double price;             
    boolean isAvailable;     
    char size;                
    long productCode;         
    float weight;             

    // Method to display the nosepin information
	
    public void display()
	{
        System.out.println("Material: " + material);
        System.out.println("Quantity Available: " + quantity);
        System.out.println("Price: " + price + "rupees");
        System.out.println("Is Available: " + isAvailable);
        System.out.println("Size: " + size);
        System.out.println("Product Code: " + productCode);
        System.out.println("Weight: " + weight + " grams");
    }
}
