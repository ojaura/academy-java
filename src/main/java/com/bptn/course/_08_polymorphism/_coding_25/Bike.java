package com.bptn.course._08_polymorphism._coding_25;

public class Bike extends Vehicle {
	
	//Declare String bikeHandle 
	String bikeHandle;
	
	// Parameterized constructor
	public Bike(String color, String brand, String bikeHandle) {
		super(color, brand);//this calls the constructor from the Vehicle class(parent class)
		this.bikeHandle= bikeHandle;
	}

	@Override
	public void print() { 
		  super.print(); 
	}
	
}

