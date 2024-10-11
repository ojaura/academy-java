package com.bptn.course._18_java_threads._coding_39;

import java.util.Arrays;
import java.util.List;

public class MyThread extends Thread {
	
	//Declare an instance variable of type List<Integer>
	List<Integer> list;
	
	//Create a parameterized constructor
	public MyThread(String name, List<Integer> list) {
		
		super(name);
		this.list = list;
		
	}

//    // Create a constructor to initialize the above instance variable
//    public MyThread(SynchronizedPrinter printer) {
//        this.printer = printer;
//    }
    
    // Override the run() method to call the printNumbers() methods.
    @Override
    public void run(){
        
    	ListUtils.insertNextId(list);
    }
}
