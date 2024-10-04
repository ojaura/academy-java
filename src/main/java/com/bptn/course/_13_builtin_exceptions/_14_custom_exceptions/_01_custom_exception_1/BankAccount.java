package com.bptn.course._13_builtin_exceptions._14_custom_exceptions._01_custom_exception_1;

public class BankAccount {
	
	//declare instance variables
	private double balance;
	private String accountNumber;
	
	//BankAccount constructor
	public BankAccount(double balance, String accountNumber) {
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	
	//create methods
	
// access returntype name parameter
	public void withdraw(double amount) throws InsufficientFundsException {
		
		if (amount > balance) {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
		
		balance -= amount; // balance = balance - amount;
		
		System.out.println("Withdrawal of $" + amount + " successful. New balance $" + balance);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
