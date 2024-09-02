class Girlfriend 
{
    // Static variables
    static String name;            
    static int age;                
    static double height;          
    static boolean isInRelationship; 
    static long anniversaryDate;   
	
    // Setter methods for static variables with return types
	
    public static String setName(String girlfriendName) 
	{
        name = girlfriendName;
        return name; 
    }

    public static int setAge(int girlfriendAge) 
	{
        age = girlfriendAge;
        return age; 
    }

    public static double setHeight(double girlfriendHeight) 
	{
        height = girlfriendHeight;
        return height; 
    }

    public static boolean setIsInRelationship(boolean inRelationship) 
	{
        isInRelationship = inRelationship;
        return isInRelationship; 
    }

    public static long setAnniversaryDate(long date)
	{
        anniversaryDate = date;
        return anniversaryDate; 
    }

    // Getter methods for static variables
	
    public static String getName() 
	{
        return name;
    }

    public static int getAge() 
	{
        return age;
    }

    public static double getHeight() 
	{
        return height;
    }

    public static boolean getIsInRelationship() 
	{
        return isInRelationship;
    }

    public static long getAnniversaryDate() 
	{
        return anniversaryDate;
    }
}
