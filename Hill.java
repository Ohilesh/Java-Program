class Hill
 {
    // Static variables
    static int heightOfHill; 
    static String nameOfHill; 
    static boolean isActive; 

    // Setter methods for static variables
    public static void setHeightOfHill(int height) 
	{
        heightOfHill = height;
    }

    public static void setNameOfHill(String name) 
	{
        nameOfHill = name;
    }

    public static void setIsActive(boolean active) {
        isActive = active;
    }

    // Method to display the values of static variables
    public static void display() 
	{
        System.out.println("Height of the hill: " + heightOfHill + " meters");
        System.out.println("Name of the hill: " + nameOfHill);
        System.out.println("Is the hill active? " + isActive);
    }
}
