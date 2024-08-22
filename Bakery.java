class Bakery
{
	public static void main(String[]argus)
	{
	double chocoCake=30585.5;
	double chocolava=25545.5;
	double paneerRolls=44615.0;
	double vegRoll=40555.5;
	double miniPizza=38945.0;
	double alooBun=13285.5;
	double[] code ={chocoCake,chocolava,paneerRolls,vegRoll,miniPizza,alooBun};
	System.out.println("The length of the array is == " +code.length);
	code[4]=28980.5;
	miniPizza=code[4];
	for(int i=0; i<=5; i++){
		System.out.println("The array value =="+code[i]);
	}
	
	
	
	
	
	}	
}