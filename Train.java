class Train
{
	public static void main(String[]argus)
	{
	float shantiExpress=130.75f;
	float preethiExpress=125.65f;
	float jyothiExpress=144.20f;
	float swathiExpress=140.95f;
	float aditiExpress=138.20f;
	float pragathiExpress=113.45f;
	float[] speed ={shantiExpress,preethiExpress,jyothiExpress,swathiExpress,aditiExpress,pragathiExpress};
	System.out.println("The length of the array is == " +speed.length);
	speed[4]=128.5f;
	aditiExpress=speed[4];
	for(int i=0; i<=5; i++){
		System.out.println("The array value =="+speed[i]);
		}
	}	
}