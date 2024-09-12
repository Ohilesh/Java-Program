class AutoRickshaw
 {
    // Instance variables 
	
    String model;          
    int seatingCapacity;   
    double farePerKm;      
    boolean isElectric;    
    char fuelType;         
    long registrationNumber; 
    float mileage;         

    // Constructor to initialize the instance variables
	
    public AutoRickshaw(String model, int seatingCapacity, double farePerKm, boolean isElectric, char fuelType, long registrationNumber, float mileage)
	{
        this.model = model;
        this.seatingCapacity = seatingCapacity;
        this.farePerKm = farePerKm;
        this.isElectric = isElectric;
        this.fuelType = fuelType;
        this.registrationNumber = registrationNumber;
        this.mileage = mileage;
    }

    // Getter methods for each instance variable
	
    public String getModel()
	{
        return model;
    }

    public int getSeatingCapacity()
	{
        return seatingCapacity;
    }

    public double getFarePerKm()
	{
        return farePerKm;
    }

    public boolean getIsElectric() 
	{
        return isElectric;
    }

    public char getFuelType()
	{
        return fuelType;
    }

    public long getRegistrationNumber() 
	{
        return registrationNumber;
    }

    public float getMileage() 
	{
        return mileage;
    }
}
