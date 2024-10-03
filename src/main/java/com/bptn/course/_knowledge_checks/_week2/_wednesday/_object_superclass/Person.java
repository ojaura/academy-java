package com.bptn.course._knowledge_checks._week2._wednesday._object_superclass;

public class Person {

	// declare instance variable
    private int id;

    // create constructor for student class
    public Student(String name, int id) {
       super(name);
       this.id = id;
    }

     //override toString method
     @Override
    public String toString() {
       return super.toString() + " " + id;
    }

}
