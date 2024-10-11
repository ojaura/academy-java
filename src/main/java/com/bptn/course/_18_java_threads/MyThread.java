package com.bptn.course._18_java_threads;

class A extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hi Java");
		}
	}
}

class B extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hello Java");
		}
	}
}


public class MyThread {

	public static void main(String[] args) {
		
		//Create an object of class A
		
		A myObj = new A();
		myObj.start();
		
		B myObj1 = new B();
		myObj1.start();
		
		System.out.println("Main thread");

	}

}

//Major key takeaways:
//1. Class A and B are running within the context of the main thread and hence it isn't executed as a separate thread.
//2. Class A and B are extending the Thread Class
//3. The start() method executes it as a separate thread
//4. It is not recommended to call the run() method directly because it runs within the context of the main thread.
//5. Extending the Thread class is one of two ways to create a thread.