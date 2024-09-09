class AadharRunner
 {
    public static void main(String[] args)
	{
        // Creating an instance of the Aadhar class
		
        Aadhar aadhar = new Aadhar();

        // Set values to the instance variables
		
        aadhar.cardNumber = 938438095375l;
        aadhar.issueDate = "13-03-2013";
        aadhar.expiryDate = "18-09-2045";
        aadhar.issuingAuthority = "UIDAI";
        aadhar.isValid = true;
        aadhar.linkedPhoneNumber = 8951213510l;
        aadhar.linkedEmail = "ohileshshivushekar@gmail.com";

        // Display the Aadhar card information
		
        aadhar.display();
    }
}
