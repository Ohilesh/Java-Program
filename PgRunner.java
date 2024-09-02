class PgRunner {

    public static void main(String[] args) {
        // Setting values for static variables in Pg class
        Pg.setNumOfFloors(4);
        Pg.setPricePerMonth(7000);

        // Displaying the values of static variables
        Pg.display();
    }
}
