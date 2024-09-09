class Wedding 
{
    // Static variables using wrapper classes
	
    static Integer guests = 200;
    static Double budget = 500000.50;
    static Boolean isOutdoor = true;
    static Character brideInitial = 'S';
    static Byte noOfPriests = 5;
    static Short venueCapacity = 300;
    static Long totalSpent = 4500000L;

    // Static method to display all static variables
	
    static void displayDetails() {
        System.out.println("Number of Guests: " + guests);
        System.out.println("Wedding Budget: " + budget);
        System.out.println("Is Outdoor Wedding: " + isOutdoor);
        System.out.println("Bride's Initial: " + brideInitial);
        System.out.println("Number of Priests: " + noOfPriests);
        System.out.println("Venue Capacity: " + venueCapacity);
        System.out.println("Total Amount Spent: " + totalSpent);
    }
}