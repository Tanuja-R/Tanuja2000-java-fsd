package com;

public class OuterClass {

	    // Member variable in the outer class
	    private String outerMessage = "Outer class message";

	    // Inner class
	    public class InnerClass {
	        // Member variable in the inner class
	        private String innerMessage = "Inner class message";

	        // Method in the inner class
	        public void displayMessages() {
	            System.out.println("Outer Message: " + outerMessage);
	            System.out.println("Inner Message: " + innerMessage);
	        }
	    }

	    // Method in the outer class
	    public void outerMethod() {
	        System.out.println("Outer method");
	    }

	    public static void main(String[] args) {
	        // Create an instance of the outer class
	        OuterClass outerInstance = new OuterClass();

	        // Create an instance of the inner class
	        OuterClass.InnerClass innerInstance = outerInstance.new InnerClass();

	        // Call methods and access variables
	        innerInstance.displayMessages();
	        outerInstance.outerMethod();
	    }
	}


}
