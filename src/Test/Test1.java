package Test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		 

	        // Input string
	      
	        String str = "ANANTHUA";

	        // Convert string to lowercase to make it case insensitive
	        str = str.toLowerCase();

	        // Create an array of size 256 (for ASCII values)
	        int[] freq22 = new int[259];

	        // Count frequency of each character using a simple for loop
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i); // Get character at index i
	            freq22[c]++;  // Increment count at ASCII index
	        }

	        // Print characters with their frequencies
	        System.out.println("Character frequencies:");
	        for (int i = 0; i < 259; i++) {
	            if (freq22[i] > 0) {
	                System.out.println((char) i + " : " + freq22[i]);
	            }
	        }

	        
	}

}
