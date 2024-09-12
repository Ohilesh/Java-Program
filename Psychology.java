class Psychology 
{
    // Instance variables 
	
    Integer studyParticipants;
    Double averageScore;
    Boolean isResearchCompleted;
    Character grade;
    Long studyDuration;
    Float successRate;
    Short totalSessions;

    // Constructor to initialize the instance variables
	
    public Psychology(Integer studyParticipants, Double averageScore, Boolean isResearchCompleted,
                      Character grade, Long studyDuration, Float successRate, Short totalSessions) 
    {
        this.studyParticipants = studyParticipants;
        this.averageScore = averageScore;
        this.isResearchCompleted = isResearchCompleted;
        this.grade = grade;
        this.studyDuration = studyDuration;
        this.successRate = successRate;
        this.totalSessions = totalSessions;
    }

    // Getter methods
	
    public Integer getStudyParticipants() {
        return studyParticipants;
    }

    public Double getAverageScore() {
        return averageScore;
    }

    public Boolean getIsResearchCompleted() {
        return isResearchCompleted;
    }

    public Character getGrade() {
        return grade;
    }

    public Long getStudyDuration() {
        return studyDuration;
    }

    public Float getSuccessRate() {
        return successRate;
    }

    public Short getTotalSessions() {
        return totalSessions;
    }
}
