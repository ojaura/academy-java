package com.bptn.course._07_oop;

public class Employee {
	
	//instance variables
	//name, employeeid and age
	
	private String name;
	private int employeeId;
	private int age;
	
	//constructors
	
	//default constructor
	public Employee() {
		this.name = "Angel";
		this.employeeId = 100;
		this.age =27;
	}
	
	//Parameterized constructor- with 2 parameters
	public Employee(String name, int employeeId) {
		this.name = name;
		this.employeeId=employeeId;
	}
	
	//Parameterized constructor- with 3 parameters
		public Employee(String name, int employeeId, int age) {
			this.name = name;
			this.employeeId=employeeId;
			this.age = age;
		}
		
		/*
	//Parameterized constructor- with 3 parameters
		public Employee(String name, int employeeId, int age) {
			this(name, employeeId); //this is trying to call the constructor Employee(String name, int employeeId)-with 2 parameters
			this.age = age;
		} */

		// methods
		public void printInfo() {
			System.out.println("Employee name: "+ this.name + " EmployeeId: " + this.employeeId + " age: " + this.age);
		}
	
	public static void main(String[] args) {
		//create objects from this class
		Employee e1 = new Employee();
		e1.printInfo();
		
		Employee e2= new Employee("John Doe", 1234);
		e2.printInfo();
		
		Employee e3= new Employee("Jane Smith", 5678, 30);
		e3.printInfo();
		
		Employee e4= new Employee("Julie", 9012);
		e4.printInfo();

	}

}

//this keyword is used to point to the current instance variable- if you have instance variables, local variable or parameter variable
//with exactly the same name. The this keyword refers to the variable that was defined at the top (instance variables) and the variable w/o this, is 
// the parameter from the local method. 

//Major key takeaways
//this keyword is used to point to the current instance variable- if you have instance variables, local variable or parameter variable with
//exactly the same name

//1. this can be used to call instance variable from current class ("Employee class")
//2. this can be used to call current class constructor
//3. this can be used to call instance methods from the current class
