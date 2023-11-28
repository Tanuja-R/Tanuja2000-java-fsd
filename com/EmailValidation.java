package com;

	import java.util.Scanner;

	public class EmailValidation {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get email input from the user
	        System.out.print("Enter your email address: ");
	        String email = scanner.nextLine();

	        // Validate email address
	        if (isValidEmail(email)) {
	            System.out.println("Valid email address.");
	        } else {
	            System.out.println("Invalid email address. Please enter a valid email.");
	        }

	        // Close the scanner
	        scanner.close();
	    }

	    // Method to validate an email address without using regular expressions
	    private static boolean isValidEmail(String email) {
	        // Check if the email contains '@' and '.'
	        if (email.contains("@") && email.contains(".")) {
	            // Check if '@' appears before '.'
	            if (email.indexOf("@") < email.lastIndexOf(".")) {
	                // Check if there is at least one character before '@'
	                return email.indexOf("@") > 0;
	            }
	        }
	        return false;
	    }
	}

}
