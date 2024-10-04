package com.bptn.course._teachbacks._week2;

public class Iphone {
	
	
	//Declare instance variables - static
	private static String companyName;
		
	
	//Declare instance variables - non-static
	private String modelType; // type of iphone
	private String color; // color of the iphone
	private int iosVersion;
	private double price;
	
	//Constructor
	public Iphone(String modelType, String color, int iosVersion, double price) {
		this.modelType = modelType;
		this.color = color;
		this.iosVersion = iosVersion;
		this.price = price;
		companyName = "Apple";
	}

	
	//Declare non-static method (requires object)
	public void displayDetails() {
		System.out.println("Model: " + modelType);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
        System.out.println("iOS Version: " + iosVersion);
        System.out.println("Company: " + companyName);  
	}
	
	
	// non-static method (objectName.methodName())
	public void updateIosVersion(int newIos) {
		this.iosVersion = newIos; // use this keyword
		System.out.println(companyName + "updated the ios for this iphone");
	}
	
	// static method (className.methodName())
	public static void changeCompanyName(String newCompanyName) {
		companyName = newCompanyName; // this keyword can't be used
		System.out.println("With the change, they also released a new model: " + modelType)
	}
	
	
	
	
	
	//Declare static method - static(doesn't require an object) 
	// -can't put a non-static instance variable here
    public static void displayCompanyName() {
        System.out.println("Company: " + companyName);
    }
    
    
	

	public static void main(String[] args) {
		
		// create iphone objects
		Iphone laraIphone = new Iphone("Iphone 13", "silver", 16, 700.00);
		Iphone samIphone = new Iphone("Iphone 14", "red", 16, 849.00);
		
		/* // display the details for each phone
		System.out.println("Accessing non-static variables for Lara's iphone");
		laraIphone.displayDetails();
		System.out.println("\nAccessing non-static variables for Sam's iphone");
		samIphone.displayDetails(); */
		
		
		// modifying static vs non-static variables
		
		// update the ios of Lara's iphone (non-static/instance-level)
		laraIphone.iosVersion = 18; // needed to create an object to accomplish this- changes for just this instance
		
		// sell the company to microsoft (static/class-level)
		Iphone.companyName = "Microsoft"; // can access using the class name- changes for all instances in the class
		
		System.out.println("Accessing non-static variables for Lara's iphone");
		laraIphone.displayDetails();
		System.out.println("\nAccessing non-static variables for Sam's iphone");
		samIphone.displayDetails();
		
		
		samIphone.updateIosVersion(19);
		samIphone.changeCompanyName("Samsung");
		
		System.out.println("Accessing non-static variables for Lara's iphone");
		laraIphone.displayDetails();
		System.out.println("\nAccessing non-static variables for Sam's iphone");
		samIphone.displayDetails();
		

	}

}
