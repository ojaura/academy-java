package com.bptn.course._15_java_collection_list._01_array_list._coding_exercises;

import java.util.List;
import java.util.ArrayList;

public class MoveSmallestElement {
	
    public static void moveSmallest(ArrayList<Integer> list) {
        int smallestIndex = 0;
        int smallest;
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < list.get(smallestIndex)) {
                smallestIndex = i;
            }
        }
        
        // remove smallest index
        smallest = list.get(smallestIndex);
        list.remove(smallestIndex);
        
        //move smallest to front
        list.add(0,  smallest);
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {3, 11, 54, 7, 1, 22};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        moveSmallest(values);
        System.out.println("Expected Result: [1, 3, 11, 54, 7, 22]");
        System.out.println("Your Result: " + values);
    }
}


