package com;

	import java.util.HashMap;
	import java.util.LinkedHashMap;
	import java.util.Map;
	import java.util.TreeMap;

	public class MapVerification {

	    public static void main(String[] args) {
	        // HashMap example
	        Map<String, Integer> hashMap = new HashMap<>();
	        hashMap.put("One", 1);
	        hashMap.put("Two", 2);
	        hashMap.put("Three", 3);

	        System.out.println("HashMap Elements:");
	        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }

	        // TreeMap example (sorted order)
	        Map<String, Integer> treeMap = new TreeMap<>(hashMap);

	        System.out.println("\nTreeMap Elements:");
	        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }

	        // LinkedHashMap example (maintains insertion order)
	        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
	        linkedHashMap.put("Dog", 4);
	        linkedHashMap.put("Cat", 2);
	        linkedHashMap.put("Elephant", 5);

	        System.out.println("\nLinkedHashMap Elements:");
	        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }
	    }
	}


}
