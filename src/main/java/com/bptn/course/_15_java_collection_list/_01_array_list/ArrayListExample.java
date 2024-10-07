package com.bptn.course._15_java_collection_list._01_array_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		
		//1st way of declaring ArrayList
		//ArrayList<Integer> arrayList = new ArrayList<>(); 
		
		// this also works
		/* ArrayList<Integer> arrayList = new ArrayList<Integer>(); */
		
		//2nd way of declaring ArrayList
		List<Integer> arrayList = new ArrayList<>();
		
		//Add values into arrayList
		arrayList.add(100);
		arrayList.add(200);
		arrayList.add(300); // ArrayList allows duplicates
		arrayList.add(300);
		arrayList.add(400); 
		arrayList.add(null);//ArrayList allows null values
		arrayList.add(null);//ArrayList allows duplicate null values
		
		//The size of the arrayList
		System.out.println("The size of the arrayList: " + arrayList.size());
		
		//Access the first element
		System.out.println("The first element is: " + arrayList.get(0));
		
		//Update the element at index 2
		arrayList.set(2,  250);
		
		System.out.println("Updated ArrayList" + arrayList);
		
		arrayList.add(7, 450);
		
		System.out.println("Updated ArrayList" + arrayList);
		
		//Remove an element from index 4
		
		System.out.println("The element re,oved is: " + arrayList.remove(4));
		
		//The size of the arrayList
		System.out.println("The size of the array is :" + arrayList.size());
		
		//Accessing the elements using traditional for-loop
		for(Integer i=0; i< arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		// Access the elements using a for-each loop-when using a collection that is not indexed
		for(Integer element: arrayList) {
			System.out.println(element);
		}
	}
}

// <> diamond operators -> Java Generics

//1. SOLID principles
//D -> Dependency Inversion principle

//We need to rely on Abstraction rather than concrete implementation

//1. The 1st way of declaring is relying on concrete implementation which does not follow Dependency Inversion Principle
//2. The 2nd way of declaring is relying on Abstraction which follows DIP
//3. ArrayList<Integer> arrayList =  new ArrayList();
//
