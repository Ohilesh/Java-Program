class Umbrella
 {
    // Static variables
    static String color;        
    static int sizeInInches;     
    static String material;      
    static boolean isAutomatic;  
    static int windResistanceLevel; 
	
    // Setter methods for static variables with return types
    public static String setColor(String umbrellaColor) 
	{
        color = umbrellaColor;
        return color; 
    }

    public static int setSizeInInches(int size)
	{
        sizeInInches = size;
        return size; 
    }

    public static String setMaterial(String umbrellaMaterial) 
	{
        material = umbrellaMaterial;
        return material;
    }

    public static boolean setIsAutomatic(boolean automatic) 
	{
        isAutomatic = automatic;
        return isAutomatic;
    }

    public static int setWindResistanceLevel(int level)
	{
        windResistanceLevel = level;
        return windResistanceLevel; 
    }

    // Getter methods for static variables
    public static String getColor()
	{
        return color;
    }

    public static int getSizeInInches() 
	{
        return sizeInInches;
    }

    public static String getMaterial()
	{
        return material;
    }

    public static boolean getIsAutomatic()
	{
        return isAutomatic;
    }

    public static int getWindResistanceLevel() 
	{
        return windResistanceLevel;
    }
}
