package com.bptn.course._17_java_collections_map;

import java.util.TreeMap;

public class TreeMapExample {
	
	public static void main(String[] args) {
		
		//declare an object for TreeMap
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		treeMap.put("Jane", 24);
		treeMap.put("Angie", 24);
		treeMap.put("Johnson", 24);
		treeMap.put("Sweytha", 24);
		
		System.out.println(treeMap);
		//treeMap.put(null,  55); // this line throws NullPointerException
		
		treeMap.put("Rick", null);
		treeMap.put("Cay", null);
		
		treeMap.put("Sweytha", 60);
		
		System.out.println(treeMap);
		
		//Access an element from TreeMap
		
		System.out.println("Johnson's age is: "+ treeMap.get("Johnson"));
		
		//Access the first key of the map
		System.out.println("Get first key of the map: "+ treeMap.firstKey());
		
		//Access the first entry of the map
		System.out.println("Get first entry of the map: "+ treeMap.firstEntry());
		
	}

}
