public class CafeRunner
{
    public static void main(String[] args) {

        // Calling the branch method with a string argument
        Cafe.branch("");

        // Calling other methods and printing their results
        System.out.println("Total Number of Employees: " + Cafe.totalNumOfEmp(07, 05));
        System.out.println("Opening Timings of cafe: " + Cafe.timings(8.30d, 13.30d, 10.30d));
    }
}
