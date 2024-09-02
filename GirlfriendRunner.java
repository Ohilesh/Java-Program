class GirlfriendRunner 
{
    public static void main(String[] args) 
	{
        // Setting values for the Girlfriend class and getting the returned values
        Girlfriend.setName("Marichike");
        Girlfriend.setAge(26);
        Girlfriend.setHeight(169.5);
        Girlfriend.setIsInRelationship(true);
        Girlfriend.setAnniversaryDate(18092020); 

        // Displaying the Girlfriend details using getter methods
		
        System.out.println("Name: " + Girlfriend.getName());
        System.out.println("Age: " + Girlfriend.getAge());
        System.out.println("Height: " + Girlfriend.getHeight() + " cm");
        System.out.println("In a relationship? " + Girlfriend.getIsInRelationship());
        System.out.println("Anniversary Date: " + Girlfriend.getAnniversaryDate());
    }
}
