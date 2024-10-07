package com.bptn.course._15_java_collection_list._01_array_list._coding_exercises._coding_33;

import java.util.List;
import java.util.ArrayList;
 
public class Main {
    
    // Complete the functionality of the method below
    public static  List<String> convertArrayToList(String[] inputArray) {
        
        // Create a new ArrayList of String. 
    	List<String> newList = new ArrayList<>();
    	

        // Iterate inputArray using a for-each loop and add the elements to the new ArrayList. Hint: Use add() method to add elements to ArrayList.

        // return the new list with elements.
    }
 
   
    // Do not modify the code below
    public static void main(String[] args) {

        String [] cars = {"Volvo","Honda","Ford"};

        List<String> arraylist = convertArrayToList(cars);

        System.out.println(arraylist);
    }
}


}
