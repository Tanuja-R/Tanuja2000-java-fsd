package com;

public class AccessModifiersExample {
	java
	class AccessModifiersExample {
	    // Public variable
	    public int publicVar = 10;

	    // Default (package-private) variable
	    int defaultVar = 20;

	    // Private variable
	    private int privateVar = 30;

	    // Public method
	    public void publicMethod() {
	        System.out.println("Public method");
	    }

	    // Default (package-private) method
	    void defaultMethod() {
	        System.out.println("Default method");
	    }

	    // Private method
	    private void privateMethod() {
	        System.out.println("Private method");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        // Create an instance of the class
	        AccessModifiersExample exampleObject = new AccessModifiersExample();

	        // Accessing public members
	        System.out.println("Public variable: " + exampleObject.publicVar);
	        exampleObject.publicMethod();

	        // Accessing default (package-private) members
	        System.out.println("Default variable: " + exampleObject.defaultVar);
	        exampleObject.defaultMethod();

	        
	    }
	}


}
