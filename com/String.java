package com;
import java.util.*;

public class String {
	
	public static void main(String[] args) {
        // Create a string
        String originalString = "Hello, World!";

        // Convert string to StringBuffer
        StringBuffer stringBuffer = new StringBuffer(originalString);

        // Convert string to StringBuilder
        StringBuilder stringBuilder = new StringBuilder(originalString);

        // Display the original string
        System.out.println("Original String: " + originalString);

        // Display the conversion to StringBuffer
        System.out.println("String to StringBuffer: " + stringBuffer);

        // Display the conversion to StringBuilder
        System.out.println("String to StringBuilder: " + stringBuilder);
    }
}