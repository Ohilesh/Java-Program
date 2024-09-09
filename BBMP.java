class BBMP
 {
    // Instance variables
	
    String name;
    int employeeID;
    double salary;
    char grade;
    boolean isPermanent;
    float performanceRating;
    long numberOfProjects;

    // Method to initialize the instance variables
    public void setDetails(String nameOfEmp, int employeeIDOfEmp, double salaryOfEmp, char gradeOfEmp, boolean permanentOfEmp, float ratingOfEmp, long projectsOfEmp)
	{
        // Assigning parameters to instance variables
        name = nameOfEmp;
        employeeID = employeeIDOfEmp;
        salary = salaryOfEmp;
        grade = gradeOfEmp;
        isPermanent = permanentOfEmp;
        performanceRating = ratingOfEmp;
        numberOfProjects = projectsOfEmp;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public char getGrade() {
        return grade;
    }

    public boolean isPermanent() {
        return isPermanent;
    }

    public float getPerformanceRating() {
        return performanceRating;
    }

    public long getNumberOfProjects() {
        return numberOfProjects;
    }
}

