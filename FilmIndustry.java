class FilmIndustry
 {
    // Static variables with different data types using wrapper classes
	
    static Integer numberOfMovies;
    static Double totalRevenue;
    static Boolean isAwardSeason;
    static Character topRatedMovieInitial;
    static Byte highestRating;
    static Short totalActors;
    static Long highestGrossingMovieRevenue;

    // ********** Setter Methods **********
    
    public static void setNumberOfMovies(Integer num) 
	{
        numberOfMovies = num;
    }

    public static void setTotalRevenue(Double revenue) 
	{
        totalRevenue = revenue;
    }

    public static void setIsAwardSeason(Boolean awardSeason) 
	{
        isAwardSeason = awardSeason;
    }

    public static void setTopRatedMovieInitial(Character initial)
	{
        topRatedMovieInitial = initial;
    }

    public static void setHighestRating(Byte rating)
	{
        highestRating = rating;
    }

    public static void setTotalActors(Short actors) 
	{
        totalActors = actors;
    }

    public static void setHighestGrossingMovieRevenue(Long revenue)
	{
        highestGrossingMovieRevenue = revenue;
    }

    // ********** Getter Methods **********
    
    public static Integer getNumberOfMovies()
	{
        return numberOfMovies;
    }

    public static Double getTotalRevenue()
	{
        return totalRevenue;
    }

    public static Boolean getIsAwardSeason() 
	{
        return isAwardSeason;
    }

    public static Character getTopRatedMovieInitial()
	{
        return topRatedMovieInitial;
    }

    public static Byte getHighestRating()
	{
        return highestRating;
    }

    public static Short getTotalActors() 
	{
        return totalActors;
    }

    public static Long getHighestGrossingMovieRevenue()
	{
        return highestGrossingMovieRevenue;
    }
}

