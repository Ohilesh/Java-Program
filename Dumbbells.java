class Dumbbells
 {
    // Static variables
	
    static float weight;         
    static char material;         
    static double handleLength;   
    static String color;          
    static boolean isAdjustable;  

    // Setter methods for static variables with return types
	
    public static void setWeight(float dumbbellWeight)
	{
        weight = dumbbellWeight;
    }

    public static void setMaterial(char dumbbellMaterial) 
	{
        material = dumbbellMaterial;
    }

    public static void setHandleLength(double length) 
	{
        handleLength = length; 
    }

    public static void setColor(String dumbbellColor)
	{
        color = dumbbellColor;
    }

    public static void setIsAdjustable(boolean adjustable)
	{
        isAdjustable = adjustable;
    }

    // Getter methods for static variables
	
    public static float getWeight()
	{
        return weight;
    }

    public static char getMaterial() 
	{
        return material;
    }

    public static double getHandleLength() 
	{
        return handleLength;
    }

    public static String getColor()
	{
        return color;
    }

    public static boolean getIsAdjustable()
	{
        return isAdjustable;
    }
}
