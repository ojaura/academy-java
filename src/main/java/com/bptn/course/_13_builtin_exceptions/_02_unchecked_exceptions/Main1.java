package com.bptn.course._13_builtin_exceptions._02_unchecked_exceptions;

public class Main1 {
	
	void method() {
		//outer try-catch block
		try {
			//inner try-catch block
			try {
				int[] arr = {1,2,3};
				System.out.println(arr[0]); //this will not fail
				System.out.println(arr[5]); // critical statement
			}
			catch(ArithmeticException e) {
				System.out.println("ArithmeticException occurred");
			}
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException is handled in the outer catch block");
		}
	}

	// main() method to run the program
    public static void main(String args[]) {
        Main1 nestedTryBlockSolutionObject = new Main1();
        nestedTryBlockSolutionObject.method();
    }
}
		

