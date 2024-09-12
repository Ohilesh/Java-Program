class Wire
 {
    // Instance variables 
	
    String material;       
    int length;            
    double resistance;     
    boolean isInsulated;  
    char grade;            
    long serialNumber;     
    float thickness;       

    // Constructor to initialize the instance variables
	
    public Wire(String material, int length, double resistance, boolean isInsulated, char grade, long serialNumber, float thickness) {
        this.material = material;
        this.length = length;
        this.resistance = resistance;
        this.isInsulated = isInsulated;
        this.grade = grade;
        this.serialNumber = serialNumber;
        this.thickness = thickness;
    }

    // Getter methods for each instance variable
	
    public String getMaterial() 
	{
        return material;
    }

    public int getLength()
	{
        return length;
    }

    public double getResistance() 
	{
        return resistance;
    }

    public boolean getIsInsulated() 
	{
        return isInsulated;
    }

    public char getGrade()
	{
        return grade;
    }

    public long getSerialNumber() 
	{
        return serialNumber;
    }

    public float getThickness() 
	{
        return thickness;
    }
}
