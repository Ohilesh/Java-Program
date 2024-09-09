class Stationary
 {
    // Instance variables 
	
    String itemName;
    int quantity;
    double price;
    boolean isAvailable;
    char size;  // S, M, L sizes
    long productCode;
    float weight;

    // Instance method to display 
	
    public void display() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Available: " + isAvailable);
        System.out.println("Size: " + size);
        System.out.println("Product Code: " + productCode);
        System.out.println("Weight: " + weight + " kg");
    }
}
