package com.bptn.course._09_abstraction;


//Abstraction using Interface-Before Java 8

interface ShapeInterface{
	
	//Before Java 8- interface had only abstract methods and constants
	//lets create some abstract metods
	
	void draw();
	
	double getArea();
}

// To implement the abstract methods from the interface- we need to create a sub-class
class RectangleClass implements ShapeInterface{
	@Override
	public void draw() {
		System.out.println("Draw a rectangle");
	}
	
	@Override
	public double getArea() {
		return
	}
}
public class Abstraction2 {
	public static void main(String[] args) {
		
	}

}
