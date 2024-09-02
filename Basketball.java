class Basketball 
{
    // Static variables
	
    static double diameter;       
    static String brand;          
    static float weight;          
    static boolean isInflated;    
    static int releaseYear;      

    // Setter methods for static variables with return types
	
    public static double setDiameter(double ballDiameter)
	{
        diameter = ballDiameter;
        return diameter; 
    }

    public static String setBrand(String ballBrand) 
	{
        brand = ballBrand;
        return brand;
    }

    public static float setWeight(float ballWeight) 
	{
        weight = ballWeight;
        return weight; 
    }

    public static boolean setIsInflated(boolean inflated) 
	{
        isInflated = inflated;
        return isInflated; 
    }

    public static int setReleaseYear(int year) 
	{
        releaseYear = year;
        return releaseYear; 
    }

    // Getter methods for static variables
	
    public static double getDiameter() 
	{
        return diameter;
    }

    public static String getBrand() 
	{
        return brand;
    }

    public static float getWeight()
	{
        return weight;
    }

    public static boolean getIsInflated() 
	{
        return isInflated;
    }

    public static int getReleaseYear()
	{
        return releaseYear;
    }
}
