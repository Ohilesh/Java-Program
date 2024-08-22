class Salon
{
	public static void main(String[]argus)
	{
		String name = "Dreams";
		int avgcustomersPerDay = 100;
	    String managerName = null;
		
		if ((name == ("Dreams")) && avgcustomersPerDay == 90){
		managerName = "Ganesh";
		}
		
		else if ((name == ("StyleKing")) && avgcustomersPerDay == 55){
			managerName = "Pratheek";
			
		}
		
		else if  ((name == ("ClustNdClean"))&& avgcustomersPerDay ==  47){
		managerName = "Praneeth";
			
		}
		
		else if  ((name == ("RockySalon"))&& avgcustomersPerDay == 63){
			managerName = "Piyush";
			
		}
		
		else if  ((name == ("KingsNdWings"))&& avgcustomersPerDay == 102){
			managerName = "Pranav";
			
		}
		
		else {managerName = "No manager found for the given salon and customer data";
		}
		
		System.out.println(" The Name of the Manager is: " +managerName);
	}
}