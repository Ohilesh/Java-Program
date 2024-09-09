class Java 
{
    // Instance variables 
	
    String version;
    int releaseYear;
    double popularityRating;
    char majorVersion;
    boolean isStable;
    float latestPatch;
    long downloads;

    // Void instance method to initialize the instance variables using parameters
	
    public void setDetails(String ver, int year, double rating, char versionChar, boolean stability, float patchVersion, long totalDownloads)

	{
        // Assigning parameters to instance variables 
        version = ver;
        releaseYear = year;
        popularityRating = rating;
        majorVersion = versionChar;
        isStable = stability;
        latestPatch = patchVersion;
        downloads = totalDownloads;
    }

	
    public String getVersion()
	{
        return version;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getPopularityRating()
	{
        return popularityRating;
    }

    public char getMajorVersion()
	{
        return majorVersion;
    }

    public boolean getIsStable()
	{
        return isStable;
    }
   
    public float getLatestPatch()
	{
        return latestPatch;
    }

    public long getDownloads()
	{
        return downloads;
    }
}
