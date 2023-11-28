package com;

public class ConstructionVerification {
	// Class variables
    private String message;

    // Default constructor
    public ConstructionVerification() {
        this.message = "Default Message";
    }

    // Parameterized constructor
    public ConstructionVerification(String customMessage) {
        this.message = customMessage;
    }

    // Method to display the message
    public void displayMessage() {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        // Create an object using the default constructor
        ConstructionVerification defaultObject = new ConstructionVerification();
        defaultObject.displayMessage();

        // Create an object using the parameterized constructor
        ConstructionVerification customObject = new ConstructionVerification("Custom Message");
        customObject.displayMessage();
    }
}


}
