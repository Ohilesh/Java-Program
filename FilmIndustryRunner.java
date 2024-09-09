class FilmIndustryRunner 
{
    public static void main(String[] args)
	{
        // Setting values using setter methods
		
        FilmIndustry.setNumberOfMovies(150);
        FilmIndustry.setTotalRevenue(1000.5);
        FilmIndustry.setIsAwardSeason(true);
        FilmIndustry.setTopRatedMovieInitial('A');
        FilmIndustry.setHighestRating((byte) 10);
        FilmIndustry.setTotalActors((short) 3000);
        FilmIndustry.setHighestGrossingMovieRevenue(1000000000L);

        // Getting and displaying values using getter methods
		
        System.out.println("Number of Movies: " + FilmIndustry.getNumberOfMovies());
        System.out.println("Total Revenue in cr: " + FilmIndustry.getTotalRevenue());
        System.out.println("Is it Award Season?: " + FilmIndustry.getIsAwardSeason());
        System.out.println("Top Rated Movie Initial: " + FilmIndustry.getTopRatedMovieInitial());
        System.out.println("Highest Rating: " + FilmIndustry.getHighestRating());
        System.out.println("Total Actors: " + FilmIndustry.getTotalActors());
        System.out.println("Highest Grossing Movie Revenue: " + FilmIndustry.getHighestGrossingMovieRevenue());
    }
}
