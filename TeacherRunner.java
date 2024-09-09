class TeacherRunner
 {
    public static void main(String[] args) 
	{
        // Create an instance of Teacher
        Teacher teacher = new Teacher();
        
        // Set details for the teacher
        teacher.setDetails("Ganga", 0312, "Social", 15, true, 9.5f, 150);

        // display teacher details
  
        System.out.println("Name: " + teacher.getName());
        System.out.println("Employee ID: " + teacher.getEmployeeID());
        System.out.println("Subject: " + teacher.getSubject());
        System.out.println("Years of Experience: " + teacher.getYearsOfExperience());
        System.out.println("Is Tenured: " + teacher.isTenured());
        System.out.println("Rating: " + teacher.getRating());
        System.out.println("Number of Students: " + teacher.getNumberOfStudents());
        
    }
}
