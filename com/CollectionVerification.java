package com;

	import java.util.*;

	public class CollectionVerification {

	    public static void main(String[] args) {
	        // List
	        List<String> myList = new ArrayList<>();
	        myList.add("Element 1");
	        myList.add("Element 2");
	        System.out.println("List: " + myList);

	        // Set
	        Set<Integer> mySet = new HashSet<>();
	        mySet.add(1);
	        mySet.add(2);
	        mySet.add(3);
	        System.out.println("Set: " + mySet);

	        // Map
	        Map<String, Integer> myMap = new HashMap<>();
	        myMap.put("Key 1", 100);
	        myMap.put("Key 2", 200);
	        System.out.println("Map: " + myMap);

	        // Queue
	        Queue<String> myQueue = new LinkedList<>();
	        myQueue.offer("Item 1");
	        myQueue.offer("Item 2");
	        System.out.println("Queue: " + myQueue);

	        // Check if a collection contains a specific element
	        System.out.println("Contains 'Element 1' in List: " + myList.contains("Element 1"));

	        // Iterating through a collection
	        System.out.println("Iterating through Set:");
	        for (Integer num : mySet) {
	            System.out.println(num);
	        }

	        // Removing an element from a collection
	        myList.remove("Element 1");
	        System.out.println("List after removal: " + myList);
	    }
	}
}
