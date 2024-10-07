package com.bptn.course._15_java_collection_list._01_array_list._coding_exercises._coding_33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main1 {
	
	public static void main(String[] args) {
		String [] cars = {"Volvo", "Honda", "Ford"};
		
		// converts a regular array to an ArrayList
		// The array and ArrayList should be the same type
		List<String> newList = new ArrayList<>(Arrays.asList(cars));
		
		System.out.println("The converted arrayList is: " + newList);
		
		
		
		
	

}
