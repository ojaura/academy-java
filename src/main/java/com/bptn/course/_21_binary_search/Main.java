package com.bptn.course._21_binary_search;

import java.util.Arrays;

public class Main {
	
public void Start(){
	
    //Initialize int array and int key variables
    int[] array = {3, 6, 1, 4, 2, 9, 7, 8, 5, 0};
    int x = 1;

    //Sort the elements in the array
    Arrays.sort(array);

    //sort array
    int result = binarySearch(array,x);

    //Print values in array after sort
    System.out.println(result);

}

//Create binarySearch algorithm
int binarySearch(int arr[], int x){

  //Declare integers to store the beginning and end index of the array
   int beginning = 0;
   int end = arr.length - 1;

   while(beginning <= end) {
    int array_mid = (beginning + end) / 2;
    if (x == arr[array_mid]) {
      return array_mid;
    }
    
  // check if key is in the lower side of the array
    if (x < arr[array_mid]) {
      end = array_mid - 1;
    }

  // check if the key is in the upper side of the array
    else {
      beginning = array_mid + 1;
    }
   }
   return -1;
}

   public static void main(String[] args) {
    Main main = new Main();
    main.Start();
}

}
