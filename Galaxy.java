class Galaxy
{
	public static void main(String[]argus)
	{
		String starName = "Sun";
		double disFromEarth = 0;
	
		
		if (starName == ("Sun")){
		disFromEarth = 24875263;
		
		}
		
		else if (starName == ("Betelgeuse")){
			disFromEarth = 3546438;
			
		}
		
		else if  (starName == ("Achernar")){
			disFromEarth = 1484225;
			
		}
		
		else if  (starName == ("Kentaurus")){
			disFromEarth = 65412368;
			
		}
		
		else if  (starName == ("Procyon")){
			disFromEarth = 68542821;
			
		}
		
		else if  (starName == ("Vega")){
			disFromEarth = 14645248;
			
		}
		else {
   
            disFromEarth = 0; 
            System.out.println("Star not found. Please check the star name again.");
        }
		
		System.out.println(" The Distance from Earth is: " +disFromEarth);

	}	
}