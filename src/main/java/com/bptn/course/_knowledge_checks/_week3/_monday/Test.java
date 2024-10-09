package com.bptn.course._knowledge_checks._week3._monday;

import java.util.ArrayList;

public class Test {
	
	public static ArrayList<Integer> reverse(ArrayList<Integer> list) {
        //Instantiate Arraylist called reversed
        ArrayList<Integer> reversed = new ArrayList<Integer>();

        //loop through the passed ArrayList, list
        for (int ind = list.size()-1; ind >= 0; ind--) {
            //Add elements in reverse
            reversed.add(list.get(ind));
        }
        return reversed;
    }

	public static void main(String[] args) {
		//instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 5, 7, 9, -2, 3, 2};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        ArrayList<Integer> result = reverse(values);
        System.out.println("Expected Result:\t [2, 3, -2, 9, 7, 5, 1]");
        System.out.println("Your Result:\t\t " + result);
	}

}
