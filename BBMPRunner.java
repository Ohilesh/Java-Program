class BBMPRunner 
{
    public static void main(String[] args) 
	{
        // Create an instance of BBMP
        BBMP bbmp = new BBMP();
        
        // Set details for the BBMP employee
        bbmp.setDetails("Ohilesh", 56778, 75000.50, 'B', true, 9.5f, 192);

        // Retrieve and display BBMP details
        System.out.println("BBMP Employee Details:");
        System.out.println("Name: " + bbmp.getName());
        System.out.println("Employee ID: " + bbmp.getEmployeeID());
        System.out.println("Salary: " + bbmp.getSalary());
        System.out.println("Grade: " + bbmp.getGrade());
        System.out.println("Is Permanent: " + bbmp.isPermanent());
        System.out.println("Performance Rating: " + bbmp.getPerformanceRating());
        System.out.println("Number of Projects: " + bbmp.getNumberOfProjects());
    }
}
