package com.bptn.course._17_java_collections_map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	
	public static void main(String[] args) {
		
		//Create an object
		Map<String, Integer> hashMap = new HashMap<>();
		
		hashMap.put("Angie", 33);
		hashMap.put("Steve", 34);
		hashMap.put("John", 35);
		hashMap.put("Angie", 32);
		hashMap.put("Jane", 34);
		hashMap.put("Sweytha", 50);
		
		System.out.println(hashMap);
		
		
		//keySet() -> returnSet view of the keys
		//get(Object k) -> return the value
		//retrieves key
		for(String key: hashMap.keySet()) {
			System.out.println("Name: "+ key + "Age: ");
		}
		
		//retrieves value
		for(String key: hashMap.keySet()) {
			System.out.println("Age: "+ hashMap.get(key));
		}
		
		//retrieves both key and value
		for(String key: hashMap.keySet()) {
			System.out.println("Name: "+ key +" Age: "+ hashMap.get(key));
		}
		//retrieve the age of John and prints it to the console
		System.out.println("Age of John is: " + hashMap.get("John"));
		
		//Update a value of existing key
		hashMap.replace("Jane", 40);
		
		System.out.println("The new age of Jane is: "+ hashMap.get("Jane"));
		
		//Check if the key is present in the map using containsKey(Object k) method
		if(hashMap.containsKey("Jane")) {
			System.out.println("The key is existing in the map");
		}
		else {
			System.out.println("The key does not exist in the map");
		}
		
		//Check if the key is present in the map using containsValue(Object v) method
		if(hashMap.containsValue(34)) {
			System.out.println("The value exists in the map");
		}
		else {
			System.out.println("The value does not exist in the map");
		}
		
		//putIfAbsent(Object k, Object v) is used to add a key-value pair if a key does not exist in the map
		hashMap.putIfAbsent("Sweytha", 60);
		System.out.println("hashMap");
		
		//iterating through the HashMap
		for(Map.Entry<String, Integer> entry: hashMap.entrySet()) {
			
			System.out.println("Name: " + entry.getKey() + " Age: " + entry.getValue());
		}
	}

}

//Major key takeaways:
//1. Does it preserve insertion order? No
//2. Do keys allow null values?
//3. Do values allow null values?
//4. Do keys allow duplicates? If you try to add the same key, it will override the value rather than making a new one.
//5. Do values allow duplicates? yes
