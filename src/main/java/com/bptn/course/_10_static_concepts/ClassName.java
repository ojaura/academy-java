package com.bptn.course._10_static_concepts;

public class ClassName {
	
	//Declare instance variables
	
	//Static variable
	// keyword type name
	static int staticVariable = 100;
	
	//Instance variable
	int instanceVariable;
	
	//declare a static method
	static void staticMethod()  {
		System.out.println("Static method is called..");
		
		//can I access an instance variable within a static method? No
		//instanceVariable=100;
		
		//can I access an instance method? No
		//instanceMethod();
	}
	
	void instanceMethod() {
		
		System.out.println("Instance method is called...");
		//Can I access a static variable within an instance method? - Yes
		System.out.println("Static variable : "+ staticVariable);
		
		//Can I access a static method within an instance method?
		staticMethod();
	}
	

	public static void main(String[] args) {
		
		ClassName c1 = new ClassName();
		c1.instanceMethod();
		
		//Access the static variable
		System.out.println("Static variable : " + staticVariable);
		
		staticMethod();
	}

}


//Major takeaways
//1. We cannot access instance variables or methods within a static method.
//2. We can access static variables and static methods within an instance method
//3. We can access a static method and variable within the main method.