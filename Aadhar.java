class Aadhar 
{
    // Instance variables 
	
    long cardNumber;
    String issueDate;
    String expiryDate;
    String issuingAuthority;
    boolean isValid;
    long linkedPhoneNumber;
    String linkedEmail;

    // Instance method to display 
	
    public void display()
	{
        System.out.println("Aadhar Card Number: " + cardNumber);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Issuing Authority: " + issuingAuthority);
        System.out.println("Is Card Valid: " + isValid);
        System.out.println("Linked Phone Number: " + linkedPhoneNumber);
        System.out.println("Linked Email: " + linkedEmail);
    }
}
