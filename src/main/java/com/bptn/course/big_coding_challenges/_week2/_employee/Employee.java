package com.bptn.course.big_coding_challenges._week2._employee;

class Employee {
	
   // Instance variable to store salary
   private double salary;
   // Instance variable to store hours per day worked by employee
   private int hoursPerDay;

   // Constructor to set instance variables(salary and hoursPerDay) value 
   public Employee(double salary, int hoursPerDay) {
	    this.salary = salary;
	    this.hoursPerDay = hoursPerDay;
	    setSalary();
		setHoursPerDay();
   }

   // Set method to update salary
   public void setSalary() {
	   if (salary < 500) {
	      salary += 10;
	    }
   }

   // Set method to update hoursPerDay
   public void setHoursPerDay() {
	    if (hoursPerDay > 6) {
	      salary += 5;
	    }
   }
   // Get method to return salary
   public double getSalary() {
	   return salary;
   }

   public static void main(String[] args) {
       // create an instance of Employee class and initialize it with salary = 100 and hoursPerDay = 8
       Employee student = new Employee(100, 8);
       
       // print the salary of the employee
       System.out.println(student.getSalary());
   }
}

