package com.bptn.course._11_access_modifiers._01_package_a;

public class ClassA {
	
	
	//declare a private variable
	private int privateVar;
	
	//declare a public variable
	public int publicVar;
	
	//declare a protected variable
	protected int protectedVar;
	
	//declare a private method
	private void privateMethod() {
		System.out.println("This is private method");
	}
	
	//declare a public method
	private void publicMethod() {
		System.out.println("This is public method");
	}
		
	//declare a default method
	private void defaultMethod() {
		System.out.println("This is default method");
	}
		
	//declare a protected method
	private void protectedMethod() {
		System.out.println("This is protected method");
	}

	public static void main(String[] args) {
		
		//create an object of ClassA
		ClassA myObj = new ClassA();
		
		//Yes we can access the private method within the same class
		myObj.privateMethod();
		
		//Yes we can access the private variable within the same class
		System.out.println("Accessing private variable: " + myObj.privateVar);
	}
}


//Major key takeaways
//1. We can access the private variable and method within the same class