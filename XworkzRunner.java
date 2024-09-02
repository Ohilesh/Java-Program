public class XworkzRunner
{
    public static void main(String[] args) {

        // Calling the batch method with a string argument
        Xworkz.batch("");

        // Calling other methods and printing their results
        System.out.println("Number of Batches: " + Xworkz.students(10));
        System.out.println("Number of Trainees: " + Xworkz.trainees(200));
        System.out.println("Number of Trainers: " + Xworkz.trainers(15));
        System.out.println("Total Number of Students in Two Batches: " + Xworkz.numOfStudentsInTwoBatches(35, 50));
        System.out.println("Contact us at: " + Xworkz.contactUs(9886971480d, 9886971483d, 9886971483d));
    }
}
