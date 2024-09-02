class CivilService
 {
    // Static variables
    static int numberOfVacancies; 
    static int salaryPerMonth; 

    // Setter methods for static variables
    public static void setNumberOfVacancies(int vacancies)
	{
        numberOfVacancies = vacancies;
    }

    public static void setSalaryPerMonth(int salary) 
	{
        salaryPerMonth = salary;
    }

    // Method to display the values of static variables
    public static void display()
	{
        System.out.println("Number of vacancies in Civil Service: " + numberOfVacancies);
        System.out.println("Salary per month in Civil Service: " + salaryPerMonth);
    }
}
