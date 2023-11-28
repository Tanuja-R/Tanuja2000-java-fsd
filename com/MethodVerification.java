package com;

public class MethodVerification {

	    // Method 1: A simple method with no parameters
	    static void printHello() {
	        System.out.println("Hello!");
	    }

	    // Method 2: A method with parameters and return value
	    static int addNumbers(int a, int b) {
	        return a + b;
	    }

	    // Method 3: A method with a default parameter
	    static void printMessage(String message, boolean uppercase) {
	        if (uppercase) {
	            message = message.toUpperCase();
	        }
	        System.out.println(message);
	    }

	    public static void main(String[] args) {
	        // Calling Method 1
	        printHello();

	        // Calling Method 2
	        int result = addNumbers(5, 7);
	        System.out.println("Sum of numbers: " + result);

	        // Calling Method 3 with different arguments
	        printMessage("This is a message", false);
	        printMessage("Another message", true);
	    }
	}


