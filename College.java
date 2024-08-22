class College {
    public static void main(String[] args) {
        
        int aSec = 55;
        int bSec = 50;
        int cSec = 52;
        int dSec = 58;
        int eSec = 40;
        int fSec = 59;
        int[] attendance = {aSec, bSec, cSec, dSec, eSec, fSec};
        System.out.println("The length of the array is: " + attendance.length);
		attendance[4]=60;
	eSec=attendance[4];
	for(int i=0; i<=5; i++){
		System.out.println("The array value =="+attendance[i]);
		}
    }
}