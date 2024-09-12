class Furniture
 {
    // Instance variables 
	
    String type;          
    int quantity;        
    double price;         
    boolean isAssembled;  
    char materialGrade;   
    long itemId;          
    float discount;       

    // Constructor to initialize the instance variables
	
    public Furniture(String type, int quantity, double price, boolean isAssembled, char materialGrade, long itemId, float discount)
	{
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.isAssembled = isAssembled;
        this.materialGrade = materialGrade;
        this.itemId = itemId;
        this.discount = discount;
    }

    // Getter methods for each instance variable
	
    public String getType()
	{
        return type;
    }

    public int getQuantity()
	{
        return quantity;
    }

    public double getPrice() 
	{
        return price;
    }

    public boolean getIsAssembled()
	{
        return isAssembled;
    }

    public char getMaterialGrade() 
	{
        return materialGrade;
    }

    public long getItemId()
	{
        return itemId;
    }

    public float getDiscount()
	{
        return discount;
    }
}
