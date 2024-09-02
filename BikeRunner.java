public class BikeRunner
{
    public static void main(String[] args) {

        // Calling the bikeCompany method with a string argument
        Bike.bikeCompany("");

        // Calling other methods and printing their results
        System.out.println("Name of Bikes Model: " + Bike.nameOfBikes("Bullet", "Himalayan", "Shotgun"));
        System.out.println("The Price of bikes are: " + Bike.bikePrice(270000f, 350000f, 300000f));
        System.out.println("Number of Customers per month: " + Bike.customers(24));
        System.out.println("The engine Specifications are: " + Bike.engine(350, 4000));
        System.out.println("The milage of the bike are : " + Bike.mileage(40, 35, 35));
		System.out.println("Total Number of customers (all bikes): " + Bike.totalNumOfCustomers(24,35,10));
		System.out.println("Contact us at: " + Bike.contact(9686904968l, 8951213510l, 9980410222l));
		System.out.println("The Features of the bike are: " + Bike.features("No ABS", "No LED Lamps", "No Auto Shifter"));
    }
}
