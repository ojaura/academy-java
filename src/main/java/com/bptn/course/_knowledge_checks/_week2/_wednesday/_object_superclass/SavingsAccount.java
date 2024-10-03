package com.bptn.course._knowledge_checks._week2._wednesday._object_superclass;

public class SavingsAccount extends Account {
	
	//declare instance variable
	private double interest;
	
	//create constructor
	public SavingsAccount(String name, double balance, double interest) {
		super(name, balance);
		this.interest = interest;
	}
	
	
	//write a toString()
	public String toString() {
		
		return super.toString() + "," + interest;
	}
	
	
	public boolean equals(Object other) {
	   // Type cast other to a Account
	  SavingsAccount otherAccount = (SavingsAccount) other;
	   // Check if interest rates are equal
	   return super.equals(otherAccount) && this.interest == otherAccount.interest;
	}
    

}
