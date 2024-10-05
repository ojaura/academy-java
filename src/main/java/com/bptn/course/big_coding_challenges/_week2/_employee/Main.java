package com.bptn.course.big_coding_challenges._week2._employee;

//Do not modify below code
public class Main {
	
    public static void main(String[] args) {
       // create an instance of Employee class and initialize it with salary = 100 and hoursPerDay = 8
       Employee student = new Employee(100, 8);
       
       // print the salary of the employee
       System.out.println(student.getSalary());
   }
}


//Pseudocode
// Major tasks: calculate salary

//Create employee class
// declare instance variables, double salary & int hours per day
// create parameterized constructor
// create setter methods, setSalary and setHoursperday
// setsalary method: if salary < 500 then salary+= 10 else nothing.
//setHoursPerDay method: if hoursPerDay > 6 then salary+= 5 else nothing
// getSalary returns salary


