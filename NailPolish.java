class NailPolish 
{
    // Instance variables 
	
    String color;          
    int quantity;          
    double price;          
    boolean isGel;         
    char finish;           
    long batchNumber;      
    float discount;        

    // Constructor to initialize the instance variables
	
    public NailPolish(String color, int quantity, double price, boolean isGel, char finish, long batchNumber, float discount) 
	{
        this.color = color;
        this.quantity = quantity;
        this.price = price;
        this.isGel = isGel;
        this.finish = finish;
        this.batchNumber = batchNumber;
        this.discount = discount;
    }

    // Getter methods for each instance variable
	
    public String getColor()
	{
        return color;
    }

    public int getQuantity() 
	{
        return quantity;
    }

    public double getPrice()
	{
        return price;
    }

    public boolean getIsGel() 
	{
        return isGel;
    }

    public char getFinish()
	{
        return finish;
    }

    public long getBatchNumber()
	{
        return batchNumber;
    }

    public float getDiscount()
	{
        return discount;
    }
}
