package com.bptn.course._05_strings;

public class Strings {

	public static void main(String[] args) {
		
		// this is how to create a new string
		String s= "Hello World";
		String reversedWord = "";
		
		//Find the total length of the string
		int stringLength = s.length();
		System.out.println("The length of the string is: " + stringLength);
		
		//subString() method - to get a part of the String
		
		String sub = s.substring(0, 10);
		
		System.out.println("The substring with start index and end index 5: " + sub);
		
		//toLowerCase() - converts all the letters of the string to lowercase
		String lowerCaseString = s.toLowerCase();
		System.out.println("The lowercase of Hello World is: " + lowerCaseString);
		
		//toUpperCase() - converts all the letters of the string to lowercase
		
		String upperCaseString = s.toUpperCase();
		
		System.out.println("The uppercase of the string is: " + upperCaseString);
		
		int index = s.indexOf("World");
		System.out.println("The index of the word, 'World' is: " + index);
		
		//Find the character at the specified index
		char c =s.charAt(0);
		
		System.out.println("The character at index 0: "+ c);
		
		//Find the character at the specified index -3
		
		char c1 = s.charAt(3);
		
		System.out.println("The character at index 3: "+ c1);
		
		for(int i = s.length()-1; i>= 0; i--) {
			reversedWord += s.charAt(i);
		}
		
		System.out.println("Reversed word: "+ reversedWord);
		
		String message = "12" + 4 + 3;
		System.out.println(message);
		
		String message1 = "This is a test";
		System.out.println(message1.indexOf("Hello"));
		  
	//	String s1 = "baby";
		//String s2 = s1.substring(0,3);
		//String s3 = "Miss you!";
		//int leng = s3.length();
		
		String s4 = "baby";
		//String s5 = s1.substring(2);
		
		String s6 = new String("hi there");
		int pos = s6.indexOf("e");
		String s7 = s6.substring(0,pos);

		String s1 = "Hi";
		String s2 = "Bye";
		int answer = s1.compareTo(s2);
		
		System.out.println("the" + answer);
}
}
