package com.bptn.course._13_builtin_exceptions._01_checked_exceptions;

import java.io.FileNotFoundException;

public class CheckedExceptionExample {

	public static void main(String[] args) {
		try {
			readFile("Result.txt");
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
		
	}
	
	//create a method which reads a file
	public static void readFile(String fileName) throws FileNotFoundException {
		//create an object of FileReader
		
		FileReader fileReader = new FileReader(fileName);
	}

}
