class Factory 
{
    static char itemType = 'C'; 

    public static void performSwitch() 
    {
        switch (itemType)
        {
            case 'A':
                System.out.println("Shirt");
                break;
                
            case 'B':
                System.out.println("Pants");
                break;
                
            case 'C':
                System.out.println("Jacket");
                break;
                
            case 'D':
                System.out.println("Sweater");
                break;
                
            case 'E':
                System.out.println("Dress");
                break;
                
            case 'F':
                System.out.println("Skirt");
                break;
                
            case 'G':
                System.out.println("Shorts");
                break;
                
            case 'H':
                System.out.println("Coat");
                break;
                
            case 'I':
                System.out.println("Blouse");
                break;
                
            case 'J':
                System.out.println("Vest");
                break;
                
            default:
                System.out.println("Bere kade kelu hogayya");
                break;
        }
    }
}
