package com.bptn.course.big_coding_challenges._week3._word_frequency;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

	public static void main(String[] args) {
		String sentence = "This is a test sentence with no repeating words";

        // Split the sentence into words using split() method
        String[] words = sentence.split(" ");
        

        // Create a Map to store the frequency of each word
        Map<String, Integer> wordFrequency = new HashMap<>();

        //Declare variable frequency to store frequency of existing word in the map
        Integer frequency;

        // Iterate through each word in the sentence
        for (String word : words) {
            // If the word is already in the map, increment its frequency 
            if (wordFrequency.containsKey(word)) {
                frequency = wordFrequency.get(word) + 1;
                wordFrequency.put(word, frequency);
                
            }
            // If the word is not in the map, add it with a frequency of 1
            else {
                wordFrequency.put(word, 1);
               
            }
        }

        // Print the frequency of each word
        System.out.println("Word frequency: " + wordFrequency);

	}

}
