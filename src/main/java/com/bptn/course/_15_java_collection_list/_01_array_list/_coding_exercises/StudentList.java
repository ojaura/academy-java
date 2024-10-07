package com.bptn.course._15_java_collection_list._01_array_list._coding_exercises;
import java.util.*;

public class StudentList {
	
   // main method for testing
   public static void main(String[] args) {
      ArrayList<Student> roster = new ArrayList<Student>();
      roster.add(new Student("Skyler", "skyler@sky.com", 323171));
      
      // add your code here
      
      // Create second student
      Student s2 = new Student("Ayanna", "ayanna@gmail.com", 789012);
      
      //Add student to roster
      roster.add(s2);

      System.out.println(roster);
   }
 }

