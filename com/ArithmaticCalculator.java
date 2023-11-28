package com;

	import java.util.Scanner;

	public class ArithmeticCalculator {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get input numbers from the user
	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        // Perform arithmetic operations
	        double sum = add(num1, num2);
	        double difference = subtract(num1, num2);
	        double product = multiply(num1, num2);
	        double quotient = divide(num1, num2);

	        // Display results
	        System.out.println("Sum: " + sum);
	        System.out.println("Difference: " + difference);
	        System.out.println("Product: " + product);
	        System.out.println("Quotient: " + quotient);
	    }

	    // Method to add two numbers
	    private static double add(double a, double b) {
	        return a + b;
	    }

	    // Method to subtract two numbers
	    private static double subtract(double a, double b) {
	        return a - b;
	    }

	    // Method to multiply two numbers
	    private static double multiply(double a, double b) {
	        return a * b;
	    }

	    // Method to divide two numbers
	    private static double divide(double a, double b) {
	        if (b != 0) {
	            return a / b;
	        } else {
	            System.out.println("Cannot divide by zero.");
	            return Double.NaN; // NaN represents "Not a Number"
	        }
	    }
	}
	
