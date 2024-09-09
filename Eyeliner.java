class Eyeliner 
{
    static int eyelinerType = 3; 

    public static void performSwitch() 
	{
        switch (eyelinerType)
		{
            case 1:
                System.out.println("Liquid Eyeliner");
                break;
				
            case 2:
                System.out.println("Gel Eyeliner");
                break;
				
            case 3:
                System.out.println("Pencil Eyeliner");
                break;
				
            case 4:
                System.out.println("Cream Eyeliner");
                break;
				
            case 5:
                System.out.println("Felt-tip Eyeliner");
                break;
				
            case 6:
                System.out.println("Retractable Eyeliner");
                break;
				
            case 7:
                System.out.println("Kohl Eyeliner");
                break;
				
            case 8:
                System.out.println("Marker Eyeliner");
                break;
				
            case 9:
                System.out.println("Waterproof Eyeliner");
                break;
				
            case 10:
                System.out.println("Non-waterproof Eyeliner");
                break;
				
            default:
                System.out.println("Invalid eyeliner type");
                break;
        }
    }
}
