class Garments 
{
    static int garmentType = 3; 

    public static void performSwitch() 
    {
        switch (garmentType)
        {
            case 1:
                System.out.println("Shirt");
                break;
                
            case 2:
                System.out.println("Pants");
                break;
                
            case 3:
                System.out.println("Jacket");
                break;
                
            case 4:
                System.out.println("Sweater");
                break;
                
            case 5:
                System.out.println("Dress");
                break;
                
            case 6:
                System.out.println("Skirt");
                break;
                
            case 7:
                System.out.println("Shorts");
                break;
                
            case 8:
                System.out.println("Coat");
                break;
                
            case 9:
                System.out.println("Blouse");
                break;
                
            case 10:
                System.out.println("Vest");
                break;
                
            default:
                System.out.println("Bere kade kelu hogayya");
                break;
        }
    }
}
