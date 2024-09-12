class PsychologyRunner 
{
    public static void main(String[] args)
	{
        // Initialize variables using parse methods
        Integer studyParticipants = Integer.parseInt("100");     
        Double averageScore = Double.parseDouble("85.5");        
        Boolean isResearchCompleted = Boolean.parseBoolean("true"); 
        Character grade = 'A';  
        Long studyDuration = Long.parseLong("120");              
        Float successRate = Float.parseFloat("98.75");           
        Short totalSessions = Short.parseShort("15");            

        // Create a Psychology instance
		
        Psychology psychology = new Psychology(studyParticipants, averageScore, isResearchCompleted,
                                                grade, studyDuration, successRate, totalSessions);

        // Display the values using getter methods
        System.out.println("Number of Participants: " + psychology.getStudyParticipants());
        System.out.println("Average Score: " + psychology.getAverageScore());
        System.out.println("Research Completed: " + psychology.getIsResearchCompleted());
        System.out.println("Grade: " + psychology.getGrade());
        System.out.println("Study Duration (minutes): " + psychology.getStudyDuration());
        System.out.println("Success Rate (%): " + psychology.getSuccessRate());
        System.out.println("Total Sessions: " + psychology.getTotalSessions());
    }
}
