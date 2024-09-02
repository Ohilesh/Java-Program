class Chats
{
	public static void chatsShop(String shopName) 
	{
		shopName = "Prajwal Chats";
		System.out.println(" The Name of the Chats Shop is: "+ shopName);
	}
	
	public static int menu(int numOfBranches)
	{
		return 5;
	}
	public static int employees(int numOfEmp)
	{
		return 2;
	}
	public static int customers(int numOfCustomers)
	{
		return 150;
	}
	public static int numOfItems (int masalaItems, int dryItems)     
	{
		return masalaItems + dryItems;	
	}
	public static double timings (double openTime, double closeTime, double lunchTime)
	{
		return openTime;
	}
    public static String message(String messageOne, String messageTwo, String messageThree, String messageFour) 
	{
        return messageOne + ", " + messageTwo + ", " + messageThree + ", " + messageFour;
    }
}









