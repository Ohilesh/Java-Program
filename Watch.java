class Watch
{
    // Static variables 
	
    static char brandInitial;          // Initial of the watch brand (e.g., 'R' for Rolex)
    static short yearManufactured;     
    static int modelNumber;            
    static long serialNumber;          
    static float caseDiameter;
    static double weight;              
    static boolean isWaterResistant;   

    // Setter methods for static variables
	
    public static void setBrandInitial(char brandInitial)
    {
        Watch.brandInitial = brandInitial;
    }

    public static void setYearManufactured(short yearManufactured)
    {
        Watch.yearManufactured = yearManufactured;
    }

    public static void setModelNumber(int modelNumber)
    {
        Watch.modelNumber = modelNumber;
    }

    public static void setSerialNumber(long serialNumber)
    {
        Watch.serialNumber = serialNumber;
    }

    public static void setCaseDiameter(float caseDiameter)
    {
        Watch.caseDiameter = caseDiameter;
    }

    public static void setWeight(double weight)
    {
        Watch.weight = weight;
    }

    public static void setIsWaterResistant(boolean isWaterResistant)
    {
        Watch.isWaterResistant = isWaterResistant;
    }

    // Getter methods for static variables
	
    public static char getBrandInitial()
    {
        return brandInitial;
    }

    public static short getYearManufactured()
    {
        return yearManufactured;
    }

    public static int getModelNumber()
    {
        return modelNumber;
    }

    public static long getSerialNumber()
    {
        return serialNumber;
    }

    public static float getCaseDiameter()
    {
        return caseDiameter;
    }

    public static double getWeight()
    {
        return weight;
    }

    public static boolean getWaterResistant()
    {
        return isWaterResistant;
    }
}
