package com.bptn.course._22_linear_search;

public class Student {
	
	//Define instance variables name and rollNumber
    int rollNumber;
    String name;

   //Create parameterized constructor
    public Student(int rollNumber, String name) {
       this.rollNumber = rollNumber;
       this.name = name;
    }
   // Create getter method for roll number variable which returns rollNumber
   public int getRollNumber() {
       return rollNumber;
   }
   // Create getter method for name variable which returns name
  public String getName() {
       return name;
   }

}
