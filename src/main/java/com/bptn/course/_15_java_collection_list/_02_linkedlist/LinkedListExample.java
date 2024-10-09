package com.bptn.course._15_java_collection_list._02_linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		//Create and initialize a linked list
		LinkedList<String> colors = new LinkedList<>();
		
		//Add elements to the list
		colors.addFirst("red");
		
		//Add elements to the end of the list
		colors.addLast("green");
		
		//Add an element at index 1
		colors.add(1, "purple");
		
		System.out.println("Access an element at index 2: " + colors);
		
		//Remove an element from index 1
		colors.remove(1);
		
		System.out.println("LinkedList after removing element at index 1: " + colors);
		
		//Access an element at index 2
		System.out.println("Access an element at index 2: " + colors.get(2));
		
		//colors.add(null);
		
		System.out.println("Updated LinkedList :" + colors);
		
		//Access elements in the LinkedList using a for-loop
		for (int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i));
		}
		
		//Access elements in the LinkedList using a for-each loop
		for (String element : colors) {
			System.out.println(element);
		}
		
		//Accessing an element using an iterator
		System.out.println("Accessing the elements using an Iterator");
		Iterator<String> it= colors.iterator();
		
		while(it.hasNext()) {
			
			System.out.println("Accessing next element using an Iterator: " + it.next());
			
		}
		
		//Remove an element
		System.out.println("Removing an element using iterator");
		Iterator<String> iterator = colors.iterator();
		
		while(iterator.hasNext()) {
			String color = iterator.next();
			
			if (color.equals("purple")) {
				iterator.remove();
				System.out.println("The color is removed successfully");
			}
		}
		System.out.println("LinkedList after removing color: " + colors);
		
		//Add an element using ListIterator (sub interface of Iterator)
		ListIterator<String> listIterator = colors.listIterator();
		while(listIterator.hasNext()) {
			String color = listIterator.next();
			
			if (color.equals("orange")) {
				listIterator.add("black");
				System.out.println("The color is added successfully: " + colors);
			}
		}
		System.out.println("LinkedList after adding color: " + colors);
		
	}

}
