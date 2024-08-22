class Theater
{
	public static void main(String[]argus)
	{
		String movieName = "KGF";
		int ticketPrice = 200;
	    String heroName = null;
		
		if ((movieName == ("KGF")) && ticketPrice == 100){
		heroName = "Yash";
		}
		
		else((movieName == ("Kantara")) && ticketPrice == 150);{
		heroName = "Rishab";	
		}
		
	    if((movieName == ("Dia"))&& ticketPrice ==  175){
		heroName = "DiaHero";	
		}
		
		else((movieName == ("Lucia"))&& ticketPrice == 250);{
		heroName = "Sathish";	
		}
		
		if((movieName == ("UlidavaruKandanthe"))&& ticketPrice == 120){
		heroName = "Rakshith";	
		}
		
		else {heroName = "No heroName found for the given Movie data";
		}
		
		System.out.println(" The Hero of the movie is : " +heroName);
	}
}