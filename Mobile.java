class Mobile
{
	public static void main(String[]argus)
	{
		String brandName = "Poco";
		float price = 30000f;
	    String ownedBuy = null;
		
		if ((brandName == ("Poco")) && price == 10000f){
		ownedBuy = "Xiaomi";
		}
		
		else if ((brandName == ("Apple")) && price == 150000f){
		ownedBuy = "Timothy Donald Cook";	
		}
		
		else if  ((brandName == ("Samsung"))&& price ==  60000f){
		ownedBuy = "Lee Kun-hee";	
		}
		
		else if  ((brandName == ("Mi"))&& price == 25000f){
		ownedBuy = "Lei Jun ";	
		}
		
		else if  ((brandName == ("Motorola"))&& price == 28000f){
		ownedBuy = "Lenovo";	
		}
		
		else {ownedBuy = "No owner found for the given brand data";
		}
		
		System.out.println(" The Brand is owned by : " +ownedBuy);
	}
}