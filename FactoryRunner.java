class FactoryRunner 
{
    public static void main(String[] args) 
	{
        
        Factory.itemType = 'C'; 
        Factory.performSwitch();
        
        Factory.itemType = 'E'; 
        Factory.performSwitch();
        
        Factory.itemType = 'Z';  
        Factory.performSwitch();
    }
}
