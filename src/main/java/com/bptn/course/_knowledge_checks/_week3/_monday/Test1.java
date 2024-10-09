package com.bptn.course._knowledge_checks._week3._monday;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
	//Create an ArrayList called names
	ArrayList<String> names = new ArrayList<String>();
	
	//Create an array of strings called friends
	String[] friends = {"Sam", "Jessica", "Mark", "Alexis"};
	
	for (int i = 0; i < friends.length; i++) {
	    // Add names to the names ArrayList
	        names.add(friends[i]);
	    }
	    System.out.println(names);
	}
}
