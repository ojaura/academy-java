package com.bptn.course._17_java_collections_map;

import java.util.Map;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
	
	public static void main(String[] args) {
	//Create an object of linked hashmap
	Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
	
	linkedHashMap.put("Jane", 24);
	linkedHashMap.put("Angie", 25);
	linkedHashMap.put("Steve", 26);
	linkedHashMap.put("Sweytha", 50);
	linkedHashMap.put("null", 55);
	linkedHashMap.put("Sarah", null);
	linkedHashMap.put("Johnson", 24);
	linkedHashMap.put("Sweytha", 60);
	
	System.out.println(linkedHashMap);
	
	
	//Access the value in LinkedHashMap
	System.out.println("Jane's age is " + linkedHashMap.get("Jane"));
	
	//Loop over the LinkedHashMap using entrySet() method
	for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
		System.out.println("Name: " + entry.getKey() + "Age" + entry.getValue());
	}
	
	//Access the map using iterator
	Iterator<Map.Entry<String, Integer>> it = linkedHashMap.entrySet().iterator();
	
	while(it.hasNext() ) {
		
		Map.Entry<String, Integer> entry = it.next();
		
		System.out.println("Name: " + entry.getKey() + "Age: " + entry.getValue()); 
	}
	
	}
}

//Major key takeaways:
//1. Preserves insertion order
//2. Allows a maximum of one null key
//3. Allows multiple null values (similar to List)
//4. Does not allow duplicate keys. Instead it overrides an existing key-value with the new value
//5. 