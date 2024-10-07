package com.bptn.course._15_java_collection_list._01_array_list._coding_exercises._coding_34;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		List<String> nameList = new ArrayList<String>();
	
        nameList.add("Robert");
        nameList.add("Samson");
        nameList.add("Alex");
        nameList.add("William");
       
        System.out.println("Elements of List: " + nameList);

        // Create an array of String named output of the same size as nameList.
        // Hint: use the size() method. 

        String[] output = new String[nameList.size()];
        
        // Fetch the elements from the nameList and insert them into the newly created array.
        for (int ind = 0; ind < output.length; ind++) {
        	output[ind] = nameList.get(ind);
        }
        // Hint: Use the get() method to fetch the elements from the arraylist
      
        System.out.print("Elements of Array: ");
        for (int i = 0 ; i < output.length ; i++){
            System.out.print(output[i] + "  ");
        }
	}
}
