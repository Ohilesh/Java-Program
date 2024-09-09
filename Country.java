class Country 
{
    // Instance variables using wrapper classes
	
    Integer population;
    Double area;
    Boolean isDeveloped;
    Character currencySymbol;
    Byte numberOfStates;
    Short independenceYear;
    Long gdp;

    // ********** Setter Methods **********
    
    public void setPopulation(Integer population) 
	{
        this.population = population;
    }

    public void setArea(Double area) 
	{
        this.area = area;
    }

    public void setIsDeveloped(Boolean isDeveloped)
	{
        this.isDeveloped = isDeveloped;
    }

    public void setCurrencySymbol(Character currencySymbol) 
	{
        this.currencySymbol = currencySymbol;
    }

    public void setNumberOfStates(Byte numberOfStates) 
	{
        this.numberOfStates = numberOfStates;
    }

    public void setIndependenceYear(Short independenceYear) 
	{
        this.independenceYear = independenceYear;
    }

    public void setGdp(Long gdp)
	{
        this.gdp = gdp;
    }

    // ********** Getter Methods **********
    
    public Integer getPopulation()
	{
        return population;
    }

    public Double getArea()
	{
        return area;
    }

    public Boolean getIsDeveloped() 
	{
        return isDeveloped;
    }

    public Character getCurrencySymbol()
	{
        return currencySymbol;
    }

    public Byte getNumberOfStates()
	{
        return numberOfStates;
    }

    public Short getIndependenceYear()
	{
        return independenceYear;
    }

    public Long getGdp() 
	{
        return gdp;
    }
}

