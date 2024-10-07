package com.bptn.course._07_oop;

public class Student {
    // Declare the variables (instance and static)

	//define instance variables
    private static String name;
    private static int grade;
    private static String principalName="Ms.Mckoy";
    private static String studentID;
    private static int nextID = 100;
     
    // Create Constructor 
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.studentID = name.toUpperCase().charAt(0) + String.valueOf(nextID); //convert to string version of 100
        nextID++ ;
    }
    // Create static method newPrincipal
    public static void newPrincipal(String newPrincipalName) {
        principalName = newPrincipalName; // assign a new name to the principal
    }

    
    // Create static method resetID 
    public static void resetID() {
        nextID = 100;
    }
    // Create toString() method 
    public String toString() {
        return this.name + " " + this.studentID;
    }
    
    // Do not modify the code below:
    public static void main(String[] args) {
        Student s1 = new Student("Muhammed", 11);
        Student s2 = new Student("Alan", 11);
        //Student s3 = new Student("Sophie", 11);

        System.out.println("Principal Name for student 1: " + Student.principalName);
        System.out.println("Student ID for student 1: " + s1.name);
        //System.out.println("Student ID for student 2: " + s2.studentID);
       //System.out.println("Student ID for student 3: " + s3.studentID);

        Student.newPrincipal("Mr. McKoy");
        System.out.println("New principal name: " + Student.principalName);

        Student.resetID();
        Student s4 = new Student("kevin", 11);
        System.out.println("Student ID for student 4: " + s4.studentID);
        System.out.println("String representation of student 4: " + s4.toString());
    }
}
