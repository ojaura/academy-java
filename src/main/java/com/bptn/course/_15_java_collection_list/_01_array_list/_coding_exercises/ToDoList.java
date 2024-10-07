package com.bptn.course._15_java_collection_list._01_array_list._coding_exercises;

import java.util.ArrayList;

public class ToDoList {
	public static void main(String[] args) {
		
	ArrayList<String> newList = new ArrayList<>();
	newList.add("Do homework");
	newList.add("help make diner");
	newList.add("Call grandma");
	
	//Change the first element to something else
	newList.set(1, "Order Pizza");
	
	// Print the new list
	System.out.println(newList.size() + " things to do!");
	System.out.println("Here's the first thing to do: "+ newList.get(0));
	
	newList.remove(0);
	
	System.out.println("Here's the next thing to do: " + newList.get(0));
	
	}

}
