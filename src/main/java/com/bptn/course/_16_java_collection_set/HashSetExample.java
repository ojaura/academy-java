package com.bptn.course._16_java_collection_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	
	public static void main(String[] args) {
		
		// Create an object of HashSet
		
		Set<String> hashSet = new HashSet<>();
		
		hashSet.add("apple");
		hashSet.add("banana");
		hashSet.add("cherry");
		hashSet.add("mango");
		hashSet.add("apple"); // It allows duplicates ? NO!
		hashSet.add(null); // It allows null values? Yes, but not null duplicates
		
		System.out.println("The HashSet of fruits: " + hashSet );
		
	}

}

/* Major key takeaways:
 1. Insertion Order - NO; the order changes (order in which elements were added)
 2. It allows null values but not duplicate null values
 3. It does not allow duplicates
 4. The underlying implementation is a Hash Table
 5. It is not indexed because it does not preserve insertion order 

*/
