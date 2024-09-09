class Latecomers 
{
    // Instance variables 
    String managerName;        
    int projectID;            
    double projectBudget;      
    char projectPriority;      
    boolean isActiveProject;  
    float projectScore;        
    long teamSize;             

    // Method to initialize the instance variables
    public void setDetails(String nameOfManager, int idOfProject, double budgetOfProject, char priorityOfProject, boolean activeOfProject, float scoreOfProject, long sizeOfTeam) 
	{
        // Assigning parameters to instance variables
		
        managerName = nameOfManager;
        projectID = idOfProject;
        projectBudget = budgetOfProject;
        projectPriority = priorityOfProject;
        isActiveProject = activeOfProject;
        projectScore = scoreOfProject;
        teamSize = sizeOfTeam;
    }

    // Getter methods
    public String getManagerName() {
        return managerName;
    }

    public int getProjectID() {
        return projectID;
    }

    public double getProjectBudget() {
        return projectBudget;
    }

    public char getProjectPriority() {
        return projectPriority;
    }

    public boolean getIsActiveProject() {
        return isActiveProject;
    }

    public float getProjectScore() {
        return projectScore;
    }

    public long getTeamSize() {
        return teamSize;
    }
}
