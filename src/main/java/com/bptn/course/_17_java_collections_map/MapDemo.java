package com.bptn.course._17_java_collections_map;

import java.util.*;
public class MapDemo {

    public static void main(String[] args) {
    	
    	Map<Integer, String> numbers = new HashMap<>();
 
    	//Populate the map with key-value pairs
    	numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(3, "three");
        numbers.put(4, "four");
        numbers.put(5, "five");
        numbers.put(6, "six");
        numbers.put(7, "seven");
        numbers.put(8, "eight");
        numbers.put(9, "nine");
        numbers.put(10, "ten");

        //System.out.println(numbers);
        
        //Print out the map using entrySet()
        for(Map.Entry<Integer, String> entry : numbers.entrySet()) {
        	System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
        //remove the value of key 7
        numbers.remove(7);
        
        System.out.println(numbers);
        
        numbers.put(11, "eleven");
        
      //Print out the map using keySet()
        for(Integer key : numbers.keySet()) {
        	System.out.println(key + ":" + numbers.get(key));
        }
        
    }
}
