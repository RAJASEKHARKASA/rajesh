//compare same indexes of 2 different arrays and create another array for matching values

package com.Sample;

import java.util.ArrayList;

public class comparingindexesof2arrays {

	public static void main(String[] args) {
	    int a[] = {1, 2, 3, 4, 5};         // First array
	    int b[] = {1, 3, 3, 6, 5};         // Second array
	    
	    ArrayList<Integer> ab = new ArrayList<Integer>(); // Create an ArrayList to store common elements
	    
	    for (int i = 0; i < a.length; i++) { // Loop through each element of the arrays
	        if (a[i] == b[i]) {              // Check if elements at the same index are equal
	            ab.add(a[i]);                // If they are equal, add the element to the ArrayList
	        }
	    }
	    
	    Object[] c = ab.toArray();          // Convert the ArrayList to an Object array
	    for (Object obj : c) {              // Loop through the Object array
	        System.out.println(obj);         // Print each common element
	    }
	}

}
