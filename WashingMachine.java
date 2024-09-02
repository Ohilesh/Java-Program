class WashingMachine 
{
    // Static variables
    static String brand;               
    static int drumCapacity;           
    static String type;               
    static boolean isEnergyEfficient;  
    static int spinSpeed;             

    // Setter methods for static variables with return types
    public static String setBrand(String machineBrand) 
	{
        brand = machineBrand;
        return brand; 
    }

    public static int setDrumCapacity(int capacity) 
	{
        drumCapacity = capacity;
        return drumCapacity; 
    }

    public static String setType(String machineType) 
	{
        type = machineType;
        return type;
    }

    public static boolean setIsEnergyEfficient(boolean energyEfficient) 
	{
        isEnergyEfficient = energyEfficient;
        return isEnergyEfficient;
    }

    public static int setSpinSpeed(int speed)
	{
        spinSpeed = speed;
        return spinSpeed; 
    }

    // Getter methods for static variables
    public static String getBrand() 
	{
        return brand;
    }

    public static int getDrumCapacity()
	{
        return drumCapacity;
    }

    public static String getType() 
	{
        return type;
    }

    public static boolean getIsEnergyEfficient() 
	{
        return isEnergyEfficient;
    }

    public static int getSpinSpeed()
	{
        return spinSpeed;
    }
}
