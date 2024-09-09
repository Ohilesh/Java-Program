class Jewelry
{
    // Static variables 
	
    static char qualityRating;          
    static short yearManufactured;      
    static int price;                 
    static long serialNumber;          
    static float caratWeight;          
    static double weight;
    static boolean isAntique;         

    // Setter methods for static variables
	
    public static void setQualityRating(char qualityRating)
    {
        Jewelry.qualityRating = qualityRating;
    }

    public static void setYearManufactured(short yearManufactured)
    {
        Jewelry.yearManufactured = yearManufactured;
    }

    public static void setPrice(int price)
    {
        Jewelry.price = price;
    }

    public static void setSerialNumber(long serialNumber)
    {
        Jewelry.serialNumber = serialNumber;
    }

    public static void setCaratWeight(float caratWeight)
    {
        Jewelry.caratWeight = caratWeight;
    }

    public static void setWeight(double weight)
    {
        Jewelry.weight = weight;
    }

    public static void setIsAntique(boolean isAntique)
    {
        Jewelry.isAntique = isAntique;
    }

    // Getter methods for static variables
	
    public static char getQualityRating()
    {
        return qualityRating;
    }

    public static short getYearManufactured()
    {
        return yearManufactured;
    }

    public static int getPrice()
    {
        return price;
    }

    public static long getSerialNumber()
    {
        return serialNumber;
    }

    public static float getCaratWeight()
    {
        return caratWeight;
    }

    public static double getWeight()
    {
        return weight;
    }

    public static boolean getAntique()
    {
        return isAntique;
    }
}
