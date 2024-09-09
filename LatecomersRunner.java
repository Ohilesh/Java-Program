class LatecomersRunner 
{
    public static void main(String[] args) 
	{
        // Create an instance of Latecomers
        Latecomers latecomer = new Latecomers();
        
        // Set details for the Latecomers project
        latecomer.setDetails("Ohilesh", 555, 750000.00, 'A', true, 9.5f, 22);

        // Retrieve and display Latecomers project details
        System.out.println("Latecomers Project Details:");
        System.out.println("Manager Name: " + latecomer.getManagerName());
        System.out.println("Project ID: " + latecomer.getProjectID());
        System.out.println("Project Budget: " + latecomer.getProjectBudget());
        System.out.println("Project Priority: " + latecomer.getProjectPriority());
        System.out.println("Is Active Project: " + latecomer.getIsActiveProject());
        System.out.println("Project Score: " + latecomer.getProjectScore());
        System.out.println("Team Size: " + latecomer.getTeamSize());
    }
}
