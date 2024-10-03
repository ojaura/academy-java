package com.bptn.course._knowledge_checks._week2._wednesday._object_superclass;

public class Student {
	
	//instance variable
	private String name;
	
	//constructor
    public Person(String name) {
       this.name = name;
    }

    //override toString() method
    @Override
    public String toString() {
       return name;
    }
    public static void main(String[] args) {
       Person p = new Person("Sila");
       Student s = new Student("Tully", 1001);
       //System.out.println(p); //call Person toString method
      // System.out.println(s);  //call Student toString method

       //create an object of APStudent class and pass ("Tully", 1001, 90) as parameters

         APStudent aps = new APStudent("Tully", 1001, 90);

       //call APStudent toString method and print output on the console
        System.out.println(aps);
       
	}

}
