package com.bptn.course._04_arrays;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		//Declare and initialize an array with 6 values
		int[] myArray = {3,5,7,9,11,13};
		String[] words = {"ok", "yes", "no"};
		
		//Print the first and second element to the console
		System.out.println("First element: "+ myArray[0]);
		System.out.println("Second element: "+ myArray[1]);
		
		//Update the first element to 30
		myArray[0] = 30;
		
		//Print the new first element
		System.out.println("Updated first element: " + myArray[0]);
		
		//Update last element of the array using length property(w/o index) and set to 130
		myArray[myArray.length - 1] = 130;
		System.out.println("Updated last element: " + myArray[myArray.length - 1]);
		
		//for-loop to print values from 1 to 10
		for(int i=1; i<= 10; i++) {
			System.out.println(i);
		}
		
		//use for loop to print all the elements of myArray
		for(int i =0; i<myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	
		for (int i= 0; i <words.length; i++) {
			System.out.println(words[i]);
		}
		
		//Print all the elements in myArray without using for-loop
		System.out.println(Arrays.toString(myArray));
	}
}
