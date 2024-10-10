package com.bptn.course._daily_challenges._week3._tuesday;
import java.time.LocalDate;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// Start by looking in the University and Student classes. Implement the methods. 

        //Create a list of students
		ArrayList<Student> students = new ArrayList<>();
		
		//Create date objects to be used for students
		
		Date birthdate_1 = new Date(2001-1900, 6, 1);
		Date birthdate_2 = new Date(2004-1900, 5, 10);
		Date birthdate_3 = new Date(98, 7, 11);
		
//		LocalDate birthdate_2 = LocalDate.of(2001, 6, 8);
//		LocalDate birthdate_3 = LocalDate.of(1998, 5, 10);
//		
		Date admissiondate_1 =  new Date(2022-1900, 9, 10);
		Date admissiondate_2 =  new Date(2020-1900, 8, 11);
		Date admissiondate_3 =  new Date(2016-1900, 7, 9);
//		LocalDate admissiondate_2 =  LocalDate.of(2019, 9, 7);
//		LocalDate admissiondate_3 =  LocalDate.of(2016, 9, 4);

		
		// Create a bunch of student objects 
		
		Student student_1 = new Student(123, "chrisEvans", "password123", "Chris", "Evans", "chris.evans@example.com", "123-456-7890", "123 Main St", "Male", birthdate_1, admissiondate_1, 1001, "Engineering");
		Student student_2 = new Student(124, "testUsername1", "passwordTest", "Jane", "Smith", "jane.smith@example.com", "987-654-3210", "456 Maple St", "Female", birthdate_2, admissiondate_2, 1002, "Computer Science");
		Student student_3 = new Student(125, "carolineEdwards", "passCaroline", "Caroline", "Edwards", "caroline.edwards@example.com", "456-789-1234", "789 Oak St", "Female", birthdate_3, admissiondate_3, 1003, "Mathematics");
		Student student_4 = new Student(126, "ericClark", "passEric", "Eric", "Clark", "eric.clark@example.com", "321-654-9870", "101 Pine St", "Male", birthdate_3, admissiondate_3, 1004, "Biology");
		//Student student_5 = new Student();
				
        // (Make sure one student has the following studentId: 123)
        // (Make sure one other student has the following username: testUsername1)
		
		students.add(student_1);
		students.add(student_2);
		students.add(student_3);
		students.add(student_4);
		
        // Create instance of university called "university" and populate it with the students.
        University university = new University(students);

        System.out.println("\nUniversity ------ \n" + university.students);
        System.out.println("\nGetting student------\n" + university.getStudent(123));
        System.out.println("\nDeleting student------\n" + university.deleteStudent(123));
        System.out.println("\nSeaching student------\n" + university.searchStudent("testUserna"));

        System.out.println("\nUniversity ------ \n" + university.students);


	}

}
