package com.bptn.course._knowledge_checks._week2._wednesday;

public class Vehicle {
	
	//declare instance variables colour and brand
	private String colour;
	private String brand;
	
	Vehicle() {
        this("Black", "Tesla");
    }
	
	//parameterized constructor
	public Vehicle(String colour, String brand) {
		
		// assigns the parameters to the instance variables of the current object
		this.colour = colour;
		this.brand = brand;
	}
	
	public String getColour() {
		return colour;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void print() {
		System.out.println(this.colour + " " + this.brand);
	}
		

	public static void main(String[] args) {
        Car car = new Car("White", "Audi", "Chromecoloured");
        Bike bike = new Bike("Grey", "BMW", "Silvercoloured");
        System.out.println(car.getColour() + " " + car.getBrand() + " " + car.steeringWheel);
        System.out.println(bike.getColour() + " " + bike.getBrand() + " " + bike.bikeHandle);

    }

}


