package com.bptn.course._08_polymorphism._coding_25;

public class Car extends Vehicle{
	
	// Declare String steeringWheel 
	private String steeringWheel;
	
	//public constructor
	public Car(String color, String brand, String steeringWheel) {
		super(color, brand);//this calls the constructor from the Vehicle class(parent class)
		this.steeringWheel = steeringWheel;
	}
	
	// Create a print() method as per the specifications above
//	public void print() { 
//		super.print(); // this calls the print() method from the Vehicle class(parent class)
//	}
	
	@Override
	public void print() {
		System.out.println("I am Car");
	}
	
	public static void main(String[] args) {
	}
}
