package com.bptn.course.big_coding_challenges._week3._custom_exception;
// Customized Exception Class for when a product is out of stock

public class OutOfStockException extends Exception{

	// Modify the constructor below to take a String message parameter.   
    // Call the superclass constructor passing the message parameter.
	public OutOfStockException (String message) {
	  super(message);
	}

}
