class Dumbbells
 {
    // Static variables
	
    static float weight;         
    static char material;         
    static double handleLength;   
    static String color;          
    static boolean isAdjustable;  

    // Setter methods for static variables with return types
	
    public static float setWeight(float dumbbellWeight)
	{
        weight = dumbbellWeight;
        return weight; 
    }

    public static char setMaterial(char dumbbellMaterial) 
	{
        material = dumbbellMaterial;
        return material;
    }

    public static double setHandleLength(double length) 
	{
        handleLength = length;
        return handleLength; 
    }

    public static String setColor(String dumbbellColor)
	{
        color = dumbbellColor;
        return color;
    }

    public static boolean setIsAdjustable(boolean adjustable)
	{
        isAdjustable = adjustable;
        return isAdjustable; 
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
