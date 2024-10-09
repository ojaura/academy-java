package com.bptn.course._knowledge_checks._week3._monday;

import java.util.ArrayList;

public class PrintEvenIndex {
	public static void printEvenIndex(ArrayList<Integer> list) {
	        
	        // Loop through the ArrayList
	        for (int i = 0; i < list.size(); i++) {
	
	            //Check if index is even
	            if (i % 2 == 0) {
	                //Print the even index
	                System.out.print(list.get(i) + ", ");
	            }
	        }
	 }
	
	public static void main(String[] args) {
		//instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 5, 7, 9, -2, 3, 2};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        System.out.println("Expected Result:\t 1, 7, -2, 2,");
        System.out.print("Your Result:\t\t ");
        printEvenIndex(values);
	}

}
