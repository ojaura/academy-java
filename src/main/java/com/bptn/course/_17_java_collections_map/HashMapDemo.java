package com.bptn.course._17_java_collections_map;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		
		//Create HashMap object
		HashMap<String, Integer> people = new HashMap<>();
		
		//add keys
		people.put("Angie", 33);
		people.put("Steve", 30);
		people.put("John", 32);
		
		//Print out key-value pairs using keySet() method
		for(String key: people.keySet()) {
			System.out.println("Name: " + key + ", Age: " + people.get(key));
		}
		
	}

}
