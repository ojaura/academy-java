package com.bptn.course._08_polymorphism;

//Parent class
class Animal{
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

//Create sub class of the Animal class
class Dog extends Animal {
	
	// has its own methods
	// this is an overridden method because this method already exists in the parent class.
	//@Override - this phrase indicates/lets the compiler know that the method pre-exists and has its own implementation in the super class.
	// this subclass has its own implementation of the method.
	void makeSound() {
		System.out.println("Bark!");
	}
}

class Cheetah extends Animal {
	
}

public class Polymorphism1 {

	public static void main(String[] args) {
		
		//create an object of Animal class
		Animal a1  = new Animal();
		
		//create an object from Dog class
		Dog d1 = new Dog();
		d1.makeSound();
	}
}



//Major key takeaways
//--Method overriding
// You can only have one public class in a java file
// 1.Scenario 1- when the subclass decides to override an existing method in the parent class
// Scenario 2- For method overriding to occur, inheritance must happen, which is one form of Polymorphism.
// 2.Criteria for method overriding: Name of the method, return type of the method, & # of parameters in the overridden method should be the same.
// 3.By convention, the overridden method has @Override annotation
// 4.Static methods in the parent class cannot be overridden
// 5.Method overriding is also known as Run-time polymorphism