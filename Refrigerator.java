class Refrigerator
{
    // Static variables 
	
    static char energyGrade;            
    static short modelYear;             
    static int price;                   
    static long serialNumber;           
    static float powerConsumption;      
    static double weight;               
    static boolean isSmart;             

    // Setter methods for static variables 
	
    public static void setEnergyGrade(char energyGrade)
    {
        Refrigerator.energyGrade = energyGrade;
    }

    public static void setModelYear(short modelYear)
    {
        Refrigerator.modelYear = modelYear;
    }

    public static void setPrice(int price)
    {
        Refrigerator.price = price;
    }

    public static void setSerialNumber(long serialNumber)
    {
        Refrigerator.serialNumber = serialNumber;
    }

    public static void setPowerConsumption(float powerConsumption)
    {
        Refrigerator.powerConsumption = powerConsumption;
    }

    public static void setWeight(double weight)
    {
        Refrigerator.weight = weight;
    }

    public static void setIsSmart(boolean isSmart)
    {
        Refrigerator.isSmart = isSmart;
    }

    // Getter methods for static variables
	
    public static char getEnergyGrade()
    {
        return energyGrade;
    }

    public static short getModelYear()
    {
        return modelYear;
    }

    public static int getPrice()
    {
        return price;
    }

    public static long getSerialNumber()
    {
        return serialNumber;
    }

    public static float getPowerConsumption()
    {
        return powerConsumption;
    }

    public static double getWeight()
    {
        return weight;
    }

    public static boolean getSmart()
    {
        return isSmart;
    }
}
