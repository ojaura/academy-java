package com.bptn.course._04_arrays;

public class PizzaBox {

	public static void main(String[] args) {

		// Declare and initialize an array to store pizza piece numbers
		int[] pizzaPieces = {1, 2, 3, 4, 5, 6};
		
		// Loop through each pizza piece using a for loop
		    for (int i = 0; i < pizzaPieces.length; i++) {
		    	
		// Print a message indicating which pizza piece is being eaten
		    System.out.println("Eating pizza piece " + pizzaPieces[i]);
		    
		    }
	}
}


