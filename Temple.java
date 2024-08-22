class Temple
{
	public static void main(String[]argus)
	{
	char shivaTemple='S';
	char vishnuTemple='V';
	char ganeshaTemple='G';
	char durgaTemple='D';
	char krishnaTemple='K';
	char nagaTemple='N';
	char[] godName ={shivaTemple,vishnuTemple,ganeshaTemple,durgaTemple,krishnaTemple,nagaTemple};
	System.out.println("The length of the array is == " +godName.length);
	godName[3]='A';
	durgaTemple=godName[4];
	for(int i=0; i<=5; i++){
		System.out.println("The array value =="+godName[i]);
	}
	
	
	
	
	
	}	
}