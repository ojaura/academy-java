package com.bptn.course._knowledge_checks._week2._wednesday._object_superclass;

public class APStudent {
	
    // instance variable
  private int apScore;

  // create constructor
  public APStudent(String name, int id, int apScore) {
    super(name, id);
    this.apScore = apScore;
  }

  //Override the toString() method
  @Override
  public String toString() {
    return super.toString() + " " + apScore;
  }
	
}

