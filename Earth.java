class Earth
 {
    // Instance variables 
	
    Integer numberOfCountries;
    Double averageTemperature;
    Boolean isHabitable;
    Character dominantClimateZone;
    Long totalLandArea;
    Float averageAltitude;
    Short numberOfContinents;

    // Constructor to initialize the instance variables
	
    public Earth(Integer numberOfCountries, Double averageTemperature, Boolean isHabitable,
                 Character dominantClimateZone, Long totalLandArea, Float averageAltitude, Short numberOfContinents)
	{
        this.numberOfCountries = numberOfCountries;
        this.averageTemperature = averageTemperature;
        this.isHabitable = isHabitable;
        this.dominantClimateZone = dominantClimateZone;
        this.totalLandArea = totalLandArea;
        this.averageAltitude = averageAltitude;
        this.numberOfContinents = numberOfContinents;
    }

    // Getter methods
	
    public Integer getNumberOfCountries() {
        return numberOfCountries;
    }

    public Double getAverageTemperature() {
        return averageTemperature;
    }

    public Boolean getIsHabitable() {
        return isHabitable;
    }

    public Character getDominantClimateZone() {
        return dominantClimateZone;
    }

    public Long getTotalLandArea() {
        return totalLandArea;
    }

    public Float getAverageAltitude() {
        return averageAltitude;
    }

    public Short getNumberOfContinents() {
        return numberOfContinents;
    }
}
