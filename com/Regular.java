package com;

	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class PhoneNumberValidation {

	    public static void main(String[] args) {
	        // Define a regular expression for a specific phone number format (e.g., (123) 456-7890)
	        String phoneRegex = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";

	        // Test phone numbers
	        String phoneNumber1 = "(123) 456-7890";
	        String phoneNumber2 = "123-456-7890";
	        String phoneNumber3 = "(123) 45-67890";

	        // Verify if phone numbers match the specified format
	        System.out.println("Phone Number 1: " + validatePhoneNumber(phoneNumber1, phoneRegex));
	        System.out.println("Phone Number 2: " + validatePhoneNumber(phoneNumber2, phoneRegex));
	        System.out.println("Phone Number 3: " + validatePhoneNumber(phoneNumber3, phoneRegex));
	    }

	    // Method to validate a phone number using a regular expression
	    private static boolean validatePhoneNumber(String phoneNumber, String regex) {
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(phoneNumber);
	        return matcher.matches();
	    }
	}

