class EarthRunner 
{
    public static void main(String[] args) 
	{
        // Initialize variables using parse methods
		
        Integer numberOfCountries = Integer.parseInt("195");
        Double averageTemperature = Double.parseDouble("15.0");
        Boolean isHabitable = Boolean.parseBoolean("true");
        Character dominantClimateZone = 'T'; //
        Long totalLandArea = Long.parseLong("148940000"); 
        Float averageAltitude = Float.parseFloat("840"); 
        Short numberOfContinents = Short.parseShort("7");

        // Create an Earth instance
		
        Earth earth = new Earth(numberOfCountries, averageTemperature, isHabitable,
                                dominantClimateZone, totalLandArea, averageAltitude, numberOfContinents);

        // Display the values using getter methods
		
        System.out.println("Number of Countries: " + earth.getNumberOfCountries());
        System.out.println("Average Temperature (°C): " + earth.getAverageTemperature());
        System.out.println("Habitable: " + earth.getIsHabitable());
        System.out.println("Dominant Climate Zone: " + earth.getDominantClimateZone());
        System.out.println("Total Land Area (sq km): " + earth.getTotalLandArea());
        System.out.println("Average Altitude (m): " + earth.getAverageAltitude());
        System.out.println("Number of Continents: " + earth.getNumberOfContinents());
    }
}
