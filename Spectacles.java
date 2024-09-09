class Spectacles 
{
    // Instance variables 
    String brandName;         
    int modelNumber;          
    double price;             
    char frameType;           
    boolean isPrescription;   
    long stockQuantity;       

    // Method to initialize the instance variables
	
    public void setDetails(String brand, int model, double cost, char frame, boolean prescription, long stock) 
	{
        // Assigning parameters to instance variables
		
        brandName = brand;
        modelNumber = model;
        price = cost;
        frameType = frame;
        isPrescription = prescription;
        stockQuantity = stock;
    }

    // Getter methods
    public String getBrandName() {
        return brandName;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public double getPrice() {
        return price;
    }

    public char getFrameType() {
        return frameType;
    }

    public boolean getIsPrescription() {
        return isPrescription;
    }

    public long getStockQuantity() {
        return stockQuantity;
    }
}
