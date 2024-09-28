package com.bptn.course._04_arrays;

import java.util.Arrays;

public class ClassRoom {

	public static void main(String[] args) {
		
		// Initialization
		
		 //No students have been assigned but we will make classroom1 hold 3 spots(elements)
		String [] classRoom = new String [3];
		
		// Assign elements(students) to classroom2.	
		String [] classRoom = {"Jessi", "Lara", "Samuel"};
		
		String firstStudent = classRoom2[0];
		
		System.out.println("The first student is " + firstStudent); 
		
		// Indexing
		// We want to know the first and second students that enrolled in classroom2.
		
		/* String firstStudent = classRoom2[0];
		//String secondStudent = classRoom2[1];
		
		//System.out.println("The first student is " + firstStudent); 
		//System.out.println("The second student is " + secondStudent); 
		
		//Modifying/Re-assigning(skip)
				// Hmm, a different student wants to be enrolled as student 2. Let's update!
				
				// Re-assign index 1 to a new value
				/classRoom2[1] = "Simon";
				
				//update the variable so it accesses and stores the updated classroom array
				//secondStudent = classRoom2[1];
				
				System.out.println("Updated our classroom's student list. ");

				// Now let's see who the second student is.
				System.out.println("The second student is " + secondStudent);
				
			*/
		
		//Start here
		// Using .length
		
		// Initialize array
		String [] Science = {"Jessi", "Lara", "Samuel"};
		
		// Number of students in classroom
		System.out.println("How many students are in the Science classroom? " + "There are : " + Science.length);
		
		// Access the last element w/o knowing index number?
		System.out.println("The last student who enrolled in the class is: " + Science[Science.length - 1]);
		
		// Using Arrays.equals() method
		
		// initialize array called English
		String [] English = new String [3];
		English[0] = "Alice";
		English[1] = "Eman";
		English[2] = "Cynthia";
				
		//Check if the Science and English class have all the same students
		System.out.println("Do the English and Science classes have all the same students? " + Arrays.equals(English, Science)); 
		
		//Compare Science and Math class: Science = {"Jessi", "Lara", "Samuel"}; 
		String [] Math = {"Lara", "Jessi", "Samuel"};
		
		System.out.println("Are the science and math class the same? " + Arrays.equals(Math, Science));
		
		
	
		//alternate String [] Math = {"Jessi", "Lara", "Samuel"};
		
	}

}

		
		//System.out.print("The students in this class are: ");
		//System.out.print(classRoom[0] + ", "); 
		//System.out.print(classRoom[1] + ", "); 
		//System.out.print(classRoom[2]); 

