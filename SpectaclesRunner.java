class SpectaclesRunner
 {
    public static void main(String[] args) 
	{
        // Create an instance of Spectacles
        Spectacles spectacle = new Spectacles();
        
        // Set details for the Spectacles
        spectacle.setDetails("Ray-Ban", 89654, 15000.00, 'M', true, 500);

        // Retrieve and display Spectacles details
        System.out.println("Spectacles Details:");
        System.out.println("Brand Name: " + spectacle.getBrandName());
        System.out.println("Model Number: " + spectacle.getModelNumber());
        System.out.println("Price: " + spectacle.getPrice());
        System.out.println("Frame Type: " + spectacle.getFrameType());
        System.out.println("Prescription: " + spectacle.getIsPrescription());
        System.out.println("Stock Quantity: " + spectacle.getStockQuantity());
    }
}
