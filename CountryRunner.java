class CountryRunner 
{
    public static void main(String[] args)
	{
        // Creating an instance of the Country class
        Country country = new Country();
		
        
        // Setting values using setter methods
		
        country.setPopulation(1417200000);
        country.setArea(3287263.0);
        country.setIsDeveloped(false);
        country.setCurrencySymbol('R');
        country.setNumberOfStates((byte) 28);
        country.setIndependenceYear((short) 1947);
        country.setGdp(21000000000000L);

        // Getting and displaying values using getter methods
        System.out.println("Population: " + country.getPopulation());
        System.out.println("Area (sq km): " + country.getArea());
        System.out.println("Is Developed: " + country.getIsDeveloped());
        System.out.println("Currency Symbol: " + country.getCurrencySymbol());
        System.out.println("Number of States: " + country.getNumberOfStates());
        System.out.println("IndependenceYear: " + country.getIndependenceYear());
        System.out.println("GDP (in dollars): $" + country.getGdp());
    }
}