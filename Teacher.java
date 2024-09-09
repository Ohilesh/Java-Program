class Teacher 
{
    // Instance variables
	
    String name;
    int employeeID;
    String subject;
    int yearsOfExperience;
    boolean isTenured;
    float rating;
    long numberOfStudents;

    // Method to initialize the instance variables 
	
    public void setDetails(String nameGanga, int employeeIDGanga, String subjectGanga, int experienceGanga, boolean tenuredGanga, float ratingGanga, long studentsGanga) 
	{
        // Assigning parameters to instance variables
		
        name = nameGanga;
        employeeID = employeeIDGanga;
        subject = subjectGanga;
        yearsOfExperience = experienceGanga;
        isTenured = tenuredGanga;
        rating = ratingGanga;
        numberOfStudents = studentsGanga;
    }

    // Getter methods
	
    public String getName() 
	{
        return name;
    }

    public int getEmployeeID() 
	{
        return employeeID;
    }

    public String getSubject() 
	{
        return subject;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public boolean isTenured()
	{
        return isTenured;
    }

    public float getRating()
	{
        return rating;
    }

    public long getNumberOfStudents()
	{
        return numberOfStudents;
    }
	
    }
}
