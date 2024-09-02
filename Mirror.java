class Mirror 
{
    // Static variable
    static String reflectionType; 
 
    // Setter method for static variable
    public static void setReflectionType(String type)
	{
        reflectionType = type;
    }

    // Method to display the values of static variables
    public static void display() 
	{
        System.out.println("Type of reflection: " + reflectionType);
    }
}
