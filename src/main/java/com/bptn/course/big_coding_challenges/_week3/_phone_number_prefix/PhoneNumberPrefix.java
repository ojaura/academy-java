package com.bptn.course.big_coding_challenges._week3._phone_number_prefix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PhoneNumberPrefix {

	public static void main(String[] args) {
	
		// Create a list of phone numbers
        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("555-555-1234");
        phoneNumbers.add("555-555-2345");
        phoneNumbers.add("555-555-3456");
        phoneNumbers.add("444-444-1234");
        phoneNumbers.add("333-333-1234");

        // Create a set to hold the unique prefixes
        Set<String> prefixes = new HashSet<>();

        // Add the prefix of each phone number to the set using a loop

        // Using a for-each loop
        for(String phoneNumber : phoneNumbers) {
            prefixes.add(phoneNumber.substring(0, 7));
        }

        //Using a for-loop
        // for (int i = 0; i < phoneNumbers.size(); i++) {
        //     prefixes.add(phoneNumbers.get(i).substring(0, 7));
        // }            
     
        // Print the unique prefixes
        System.out.println("Unique prefixes: " + prefixes);
		

	}

}
