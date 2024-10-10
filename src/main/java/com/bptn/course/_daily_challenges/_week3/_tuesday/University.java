package com.bptn.course._daily_challenges._week3._tuesday;

import java.util.ArrayList;
import java.util.*;

class University {
	
	 // property - get inspired by the UML diagram
  	ArrayList<Student> students = new ArrayList<>();

    //Create constructor
	  public University(ArrayList<Student> students) {
		  this.students = students;
	  }

    public void addStudent(Student s) {
        // add a student to the "university" arraylist
        this.students.add(s);
    }

    public Student getStudent(long studentId) {
      // get the first student in the university that has the studentId. (ideally, this would be unique, so you can stop searching after finding the fist match)
      for(Student s : students) {
        if (s.getStudentId() == studentId) {
          return s;
        }
      }
      return null; // if no student w/that ID is found.
    }

    public List<Student> searchStudent(String userNamePrefix) {
       // return all students that have usernames beginning with the prefix 
       List<Student> studentPrefixes = new ArrayList<>();
       for(Student s : students) {
         if (s.getUserName().startsWith(userNamePrefix)) {
            studentPrefixes.add(s);
         }
       }
       return studentPrefixes;
    }

    public boolean deleteStudent(long studentId) {
       // return if a successful deletion happened
        for (Student s : students) {
          if (s.getStudentId() == studentId) {
            return students.remove(s);
          }
        }
        return false;
    }
}
