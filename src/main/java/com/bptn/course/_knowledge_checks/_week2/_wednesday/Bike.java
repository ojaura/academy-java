package com.bptn.course._knowledge_checks._week2._wednesday;

public class Bike extends Vehicle{
	
	//declare instance variable
	String bikeHandle;
	
	//parameterized constructor for subclass (Bike)
	public Bike(String colour, String brand, String bikeHandle) {
		super(colour, brand); // calls on the constructor from the superclass to initialize the instance variables with these parameters.
		this.bikeHandle = bikeHandle; // assigns the parameter bikeHandle to the instance variable, steeringWheel
	}
	
	//create print method that calls on parent's print() method
	public void print() {
		super.print();
	}

	public static void main(String[] args) {
		
	}
}
