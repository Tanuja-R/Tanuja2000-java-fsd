package com;

public class Arrayverification {
	
	    public static void main(String[] args) {
	        // Create an array of integers
	        int[] numbers = {1, 2, 3, 4, 5};

	        // Display the elements of the array
	        System.out.print("Array elements: ");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	        System.out.println();

	        // Verify if the array contains a specific value
	        int searchValue = 3;
	        boolean containsValue = containsValue(numbers, searchValue);
	        System.out.println("Array contains " + searchValue + ": " + containsValue);
	    }

	    // Method to check if an array contains a specific value
	    private static boolean containsValue(int[] array, int value) {
	        for (int num : array) {
	            if (num == value) {
	                return true;
	            }
	        }
	        return false;
	    }
	}
