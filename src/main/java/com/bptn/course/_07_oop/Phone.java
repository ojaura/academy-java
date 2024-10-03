package com.bptn.course._07_oop;

public class Phone {
	//public, private, default, protected
	//declare instance variables - properties/attributes
	//weight, height, width, color
	private int weight;
	private int height;
	private int width;
	private String color;
	
	// Constructor
	// Has the same name as the ClassName (Phone)
	// Has no return type
	// Default Constructor - does not have any parameters passed
	public Phone() {
		weight = 150;
		height = 140;
		width = 70;
		color = "Black";
	}
	
	//Parametized constructor - has parameters passed
	// constructor overloading: can have different constructors of the same name ONLY if they have different parameters, types and different number of parameters.
	public Phone(int w, int h, int wi) {
		weight = w;
		height = h;
		width = wi;
		//color = c;
	}
	public Phone(int w, int h, int wi, String c) {
		weight = w;
		height = h;
		width = wi;
		color = c;
	}
	
	
	// declare functionality/behavior (instance methods)
	public void makePhoneCall() {
		System.out.println("Make a phone call");
	}
	
	public void sendTextMessage() {
		System.out.println("Send a text message");
	}
	public static void main(String[] args) {
		Phone myObj1 = new Phone();
		System.out.println("Default Phone: "+ "Weight: " +  myObj1.weight + "Height: " + myObj1.height + "Width: " + myObj1.width + "Color " + myObj1.color);
		
		Phone myObj2 = new Phone(20, 30, 40, "blue");
		System.out.println("Custom Phone: "+ "Weight: " +  myObj2.weight + "Height: " + myObj2.height + "Width: " + myObj2.width + "Color " + myObj2.color);
		;
		Phone myObj3 = new Phone(250, 150, 60);
		System.out.println("Custom Phone without color: "+ "Weight: " +  myObj3.weight + "Height: " + myObj3.height + "Width: " + myObj3.width + "Color " + myObj3.color);
	
		// Call methods
		myObj1.makePhoneCall(); // Accessing the instance  method using the object - object.Name.instanceMethodName()
		myObj1.sendTextMessage(); // Accessing the instance  method using the object - object.Name.instanceMethodName()
	
	}
}

public class Movie
{
    private int currentPrice;
    private int movieRating;

    public Movie(int p, int r)
    {
        currentPrice = p;
        movieRating = r;
    }

    public int getCurrentPrice()
    {
        int currentPrice = 16;
        return currentPrice;
    }

    public void printPrice()
    {
        System.out.println(getCurrentPrice());
    }
}





//Instance variables are always declared as private because we want to encapsulate this
// from being accessed from another class. We don't want it to be easily accessible.

//Instance methods are always declared as public because we want it to be accessible.