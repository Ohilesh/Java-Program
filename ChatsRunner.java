public class ChatsRunner
{
    public static void main(String[] args) {

        // Calling the chatsShop method with a string argument
        Chats.chatsShop("");

        // Calling other methods and printing their results
        System.out.println("Number of Branches: " + Chats.menu(5));
        System.out.println("Number of Enployees: " + Chats.employees(2));
        System.out.println("Number of Customers: " + Chats.customers(150));
        System.out.println("Total Number of items : " + Chats.numOfItems(15, 10));
        System.out.println("Opening Timings of Shop: " + Chats.timings(8.35d, 13.30d, 10.30d));
		System.out.println("Message from our end: " + Chats.message("Thank You", "Visit Again", "God Is Great","See You Soon"));
    }
}
