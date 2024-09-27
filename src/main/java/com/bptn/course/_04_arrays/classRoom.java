package com.bptn.course._04_arrays;

public class classRoom {

	public static void main(String[] args) {
		
		// Initialization
		
		// No students have been assigned but we will make classroom1 hold 3 spots(elements)
		String [] classRoom1 = new String [3];
		
		// Assign elements(students) to classroom2.	
		String [] classRoom2 = {"Jessi", "Lara", "Samuel"};
		
		// Indexing
		// We want to know the first and second students that enrolled in classroom2.
		
		String firstStudent = classRoom2[0];
		String secondStudent = classRoom2[1];
		
		System.out.println("The first student is " + firstStudent); 
		System.out.println("The second student is " + secondStudent); 
		
		//Modifying/Re-assigning
		// Hmm, a different student wants to be enrolled as student 2. Let's update!
		
		// Re-assign index 1 to a new value
		classRoom2[1] = "Simon";
		
		//update the variable so it accesses and stores the updated classroom array
		secondStudent = classRoom2[1];
		
		System.out.println("Updated our classroom's student list. ");

		// Now let's see who the second student is.
	
		System.out.println("The second student is " + secondStudent);
		
		
		// Using .length method
		
		// Number of students in classroom
		System.out.println("How many students are in classroom 2? " + "There are : " + classRoom2.length);
		
		// What if we want to access the last element but don't know the index number?
		System.out.println("The last student who enrolled in the class is: " + classRoom2[classRoom2.length - 1]);
		
		
		
		// Using .equals() method
		// Yay! Classroom1 finally has students!:
		
		classRoom1[0] = "Alice";
		classRoom1[1] = "Eman";
		classRoom1[2] = "Cynthia";
				
		// Are they the same as classroom2? Let's check if classroom 1 and classroom2 have all the same students
		System.out.println("Do classroom1 and classroom2 have all the same students? " + classRoom1.equals(classRoom2)); 
	}

}

		
		//System.out.print("The students in this class are: ");
		//System.out.print(classRoom[0] + ", "); 
		//System.out.print(classRoom[1] + ", "); 
		//System.out.print(classRoom[2]); 

