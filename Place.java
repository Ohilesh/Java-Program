class Place
{
	public static void main(String[]argus)
	{
	String place1= "Basavanagudi";
	String place2= "Banashankari";
	String place3= "Nagarbhavi";
	String place4= "Rajajinagar";
	String place5= "Chandralayout";
	String place6= "Vijaynagar";
	String[] name ={place1,place2,place3,place4,place5,place6};
	System.out.println("The length of the array is == " +name.length);
	name[5]="LosVagas";
	place6=name[5];
	for(int i=0; i<=5; i++){
		System.out.println("The array value =="+name[i]);
		}
	}	
}