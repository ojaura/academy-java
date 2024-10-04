package com.bptn.course._13_builtin_exceptions._14_custom_exceptions._01_custom_exception_1;

public class InsufficientFundsException extends RuntimeException {

	//create instance variable
	private double amount;
	
	public InsufficientFundsException(double amount) {
		this.amount = amount;

	}
	
	public double getAmount() {
		return amount;
	}

}
