package com.bptn.course._18_java_threads;

public class MyRunnable implements Runnable {
	
	@Override
	public void run() {
		
		for(int i = 0; i <5;  i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Interrupted exception has occurred: " + e.getMessage());
			}
		}
		
	}

	public static void main(String[] args) {
		
		//Step 2: Create an object of MyRunnable (class that implements the Runnable interface)
		MyRunnable myObj = new MyRunnable();
		
		//Step 3: Create an object from the Thread class and pass the object created in Step 2 into the constructor
		Thread thread = new Thread(myObj);
		
		//Step 4: Start the thread using start()
		thread.start();
		
	}
}


//Steps to create a thread using the Runnable Interface
//Step 1. Created a class that implements the Runnable interface
//Step 2. Create an object of MyRunnable (class that implements the Runnable interface)
//Step 3. Create an object from the Thread class and pass the object created in Step 2 into the constructor
// 			of the Thread class
//Step 4. Start the thread using start()