package com.bptn.course.big_coding_challenges;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		// Declare variables
		double firstNumber;
		double secondNumber;
		double result;
		int continue_or_exit;

		// Initialize scanner object
		Scanner scan = new Scanner(System.in);
		// Declare variable to store operation choices.
		int choice;
		
		do {
			// Prompt user to select a choice for the operation they want.
			System.out.println("/…Calculator Menu…/\r\n"
					+ "Press 1 for addition\r\n"
					+ "Press 2 for subtraction\r\n"
					+ "Press 3 for multiplication\r\n"
					+ "Press 4 for division\r\n"
					+ "Press 5 to square a number\r\n"
					+ "Press 6 to find a square root\r\n"
					+ "Press 7 to find the reciprocal ");
			
			// Get user's choice
			choice = scan.nextInt();
			// Addition
			if(choice == 1) {
				// Prompt user to enter two numbers and store in variables
				System.out.println("Enter the first number: ");
				firstNumber = scan.nextDouble();
				System.out.println("Enter the second number: ");
				secondNumber = scan.nextDouble();
				// Perform addition
				result = firstNumber + secondNumber;
				// Output the result
				System.out.println("Adding "+ firstNumber + " and " + secondNumber + " is = " + result);
			}
			// Subtraction
			else if(choice == 2) {
				// Prompt user to enter two numbers and store in variables
				System.out.println("Enter the first number: ");
				firstNumber = scan.nextDouble();
				System.out.println("Enter the second number: ");
				secondNumber = scan.nextDouble();
				// Perform subtraction
				result = firstNumber - secondNumber;
				// Output the result
				System.out.println("Subtracting "+ firstNumber + " by " + secondNumber + " is = " + result);
			}	
			// Multiplication
			else if(choice == 3) {
				// Prompt user to enter two numbers and store in variables
				System.out.println("Enter the first number: ");
				firstNumber = scan.nextDouble();
				System.out.println("Enter the second number: ");
				secondNumber = scan.nextDouble();
				// Perform Multiplication
				result = firstNumber * secondNumber;
				// Output the result
				System.out.println("The product of the numbers "+ firstNumber + " and " + secondNumber + " is = " + result);
			}
			// Division
			else if(choice == 4) {
				// Prompt user to enter two numbers and store in variables
				System.out.println("Enter the first number: ");
				firstNumber = scan.nextDouble();
				System.out.println("Enter the second number: ");
				secondNumber = scan.nextDouble();
				// Perform Division
				result = firstNumber / secondNumber;
				// Output the result
				System.out.println("Dividing "+ firstNumber + " by " + secondNumber + " the quotient is " + result);
				System.out.println("The remainder is " + firstNumber % secondNumber);
			}
			// Square
			else if (choice == 5){
				// Prompt the user to enter a number.
				System.out.println("Enter the number to find its Square : ");
				firstNumber = scan.nextDouble();
				// Square the user's input number
				result = firstNumber * firstNumber;
				// Output the result
				System.out.println("The Square of the number "+ firstNumber + " is = " + result);
			}
			//Square Root
			else if (choice == 6){
				// Prompt the user to enter a number.
				System.out.println("Enter the number to find its Square Root : ");
				firstNumber = scan.nextDouble();
				// Calculate the square root of the user's input number
				result = Math.sqrt(firstNumber);
				//Output the result
				System.out.println("The Square root of the number "+ firstNumber + " is = " + result);
			}
			// Reciprocal
			else if (choice == 7){
				// Prompt the user to enter a number.
				System.out.println("Enter the number to find reciprocal : ");
				firstNumber = scan.nextDouble();
				// Calculate the reciprocal of the user's input number
				result = 1 / firstNumber;
				//Output the result
				System.out.println("The Reciprocal of the number "+ firstNumber + " is = " + result);
				
			} else {
				System.out.println("Invalid choice! Please choose between Operations 1 and 7.");
			} 
			// Give the user the options to continue or exit
			System.out.println("To continue calculation Press 1, else press any other number to exit");
			continue_or_exit= scan.nextInt();

		} while (continue_or_exit == 1);
		// Close scanner to prevent a leak
		scan.close();

	}

}
