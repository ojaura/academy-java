package com.bptn.course._knowledge_checks._week4._tuesday;

import java.util.ArrayList;
import java.util.List;

public class LinearSearchList {
	
	// linearSearch() method that takes in a List and an integer target as parameters
	  public static boolean linearSearch(List<Integer> list, int target) {
	    // Iterate over all elements in the List using for-each loop
	    for (Integer element : list) {
	      // Check if the current value is equal to the target
	      if (element == target) {
	        // If so, return true
	        return true;
	      }
	    }
	    // If the target was not found, return false
	    return false;
	   
	  }

	 
  public static void main(String[] args) {
    // Create a ArrayList of integers and populate integer values
    List<Integer> numbers = new ArrayList<>();

    numbers.add(4);
    numbers.add(16);
    numbers.add(20);
    numbers.add(10);
    numbers.add(7);
   

    // Define the target to search for
    int target = 7;
   

    // Call the linearSearch method with the list and target as arguments
    //Store the result in variable of type boolean
    boolean result = linearSearch(numbers, target);
    
    // Check the result and print the appropriate message
    if (result == true) {
       System.out.println("Target found in the List.");
    } else {
      System.out.println("Target not found in the List.");
       
    }
  }

}
