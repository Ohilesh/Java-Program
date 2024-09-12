class Labs 
{
    // Instance variables 
	
    String labName;        
    int numberOfRooms;     
    double equipmentCost;  
    boolean isCertified;   
    char safetyGrade;     
    long labId;           
    float area;           

    // Constructor to initialize the instance variables
	
    public Labs(String labName, int numberOfRooms, double equipmentCost, boolean isCertified, char safetyGrade, long labId, float area)
	{
        this.labName = labName;
        this.numberOfRooms = numberOfRooms;
        this.equipmentCost = equipmentCost;
        this.isCertified = isCertified;
        this.safetyGrade = safetyGrade;
        this.labId = labId;
        this.area = area;
    }

    // Getter methods for each instance variable
	
    public String getLabName()
	{
        return labName;
    }

    public int getNumberOfRooms()
	{
        return numberOfRooms;
    }

    public double getEquipmentCost()
	{
        return equipmentCost;
    }

    public boolean getIsCertified() 
	{
        return isCertified;
    }

    public char getSafetyGrade() 
	{
        return safetyGrade;
    }

    public long getLabId() 
	{
        return labId;
    }

    public float getArea()
	{
        return area;
    }
}
