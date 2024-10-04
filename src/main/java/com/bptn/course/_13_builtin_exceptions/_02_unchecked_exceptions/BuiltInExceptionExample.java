package com.bptn.course._13_builtin_exceptions._02_unchecked_exceptions;

public class BuiltInExceptionExample {
	
	//create a method- which checks if the number is positive or negative
	//throws always comes in the method signature
	//method has the ability to encounter a situation and should be in a position to handle it
	
	
	public static void checkPositive(int number) throws IllegalArgumentException {
		if(number<0) {
			// throw always creates an instance of exception or its subclasses
			throw new IllegalArgumentException("The number has to be positive");
		}
		System.out.println("The number is positive");
	}

	public static void main(String[] args) {
		
		try {
			checkPositive(10); //this class is expected to be fine
			checkPositive(-10);
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught an exception: " + e.getMessage());
			
		}
		
		checkPositive(-20); //unchecked exception

	}
}

//IllegalArgumentException is a sub class of RuntimeException
//RubtimeException is a sub class of Exception

//throws is optional in case of unchecked exception
//throws is used in case of checked exception (custom exception which is created as a checked exception)
// throw is used explictly within a method or block of code
// throw creates an instance of Exception(or sub-classes); it tries to the signal the program that something has gone wrong
// throws tells you that a method may throw an exception
