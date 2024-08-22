// BAnk 3 6 &&

class Bank   
{
	public static void main(String[]argus)
	{
		String branch = " Nagarbhavi";
		int accOpened = 300;
	    String managerName = "NULL";
		
		if ((branch == (" Nagarbhavi")) && accOpened == 300){
		managerName = "Ohilesh";
		}
		
		if ((branch == ("Madivala")) && accOpened == 400){
			managerName = "Chirag";
			
		}
		
		if ((branch == (" Rajajinagar"))&& accOpened ==  500){
		managerName = "Lavith";
			
		}
		
		if ((branch == ("Chikpete"))&& accOpened == 600){
			managerName = "Deyaan";
			
		}
		
		if ((branch == ("Balepete"))&& accOpened == 700){
			managerName = "Aarnav";
			
		}
		
		if ((branch == ("Akkipete"))&& accOpened == 800){
			managerName = "Upendra";
			
		}
		System.out.println(" The Name of the Manager is: " +managerName);

	}
}