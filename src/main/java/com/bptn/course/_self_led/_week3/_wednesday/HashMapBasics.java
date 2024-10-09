package com.bptn.course._self_led._week3._wednesday;

import java.util.HashMap;

public class HashMapBasics {

	public static void main(String[] args) {
		// Instantiate HashMap and try to use some of the methods listed above.
	    
        HashMap<String, String> students = new HashMap<>();

        //Populate the HashMap with student entries
        students.put("Jacob Lati", "2098765");
        students.put("Daisy Boole", "2089560");
        students.put("Hannah Williams", "2056789");
        
        //Print out the students
        System.out.println(students);
        
        //Get first student enrolled
        System.out.println(students.get("Jacob Lati"));
        
        //Check if hash map is empty
        System.out.println(students.isEmpty());
        
        //Replace a value in a hashmap
        System.out.println(students.replace("Jacob Lati", "3098765"));
        
        //Print out the students
        System.out.println(students);
        
        //Check if a value exists
        //Print out the students
        System.out.println(students.containsValue("205678"));
        
        //Check if a key exists
        System.out.println(students.containsKey("Daisy Boole"));
        
        //Clear the HashMap
        students.clear();
        
        //Check if hash map is empty
        System.out.println(students.isEmpty());
        
        //Print out the students
        System.out.println(students);

	}

}
