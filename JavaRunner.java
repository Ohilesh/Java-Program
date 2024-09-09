class JavaRunner 
{
    public static void main(String[] args) 
	{
        // Create an instance of the Java class
        Java java = new Java();

        // Set the details for the instance
        java.setDetails("Java 8", 1995, 99.5, 'J', true, 17.01f, 1000000000L);

        // Retrieve and print the details
        System.out.println("Version: " + java.getVersion());
        System.out.println("Release Year: " + java.getReleaseYear());
        System.out.println("Popularity Rating: " + java.getPopularityRating());
        System.out.println("Major Version: " + java.getMajorVersion());
        System.out.println("Is Stable: " + java.getIsStable());
        System.out.println("Latest Patch: " + java.getLatestPatch());
        System.out.println("Downloads: " + java.getDownloads());
    }
}
