package com.bptn.course._knowledge_checks._week2._wednesday;

public class Car extends Vehicle{
	
	// inherits instance variables from superclass(Vehicle)
	String steeringWheel;
	
	//parameterized constructor for subclass (Car)
	public Car(String colour, String brand, String steeringWheel) {
		super(colour, brand); // calls on the constructor from the superclass to initialize the instance variables with these parameters.
		this.steeringWheel = steeringWheel; // assigns the parameter steeringWheel to the instance variable, steeringWheel
	}
	
	//create print method that calls on parent's print() method
	public void print() {
		super.print();
	}

	public static void main(String[] args) {
		
	}

}
