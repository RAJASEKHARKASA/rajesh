package com.Sample;

import java.util.ArrayList;

public class uniqueelementsinarray {

    public static void main(String[] args) {
        // Input array with potential duplicates
        int a[] = {1, 2, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7};

        // List to hold unique elements
        ArrayList<Integer> uniqueElements = new ArrayList<>();

        // Iterate through the input array
        for (int i = 0; i < a.length; i++) {
            // Check if the element is already in the uniqueElements list
            if (!uniqueElements.contains(a[i])) {
                // Count occurrences of the current element
                int count = 0;

                // Inner loop to count how many times a[i] appears in the array
                for (int j = 0; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        count++;
                    }
                }

                // If the count is 1, it's a unique element
                if (count == 1) {
                    uniqueElements.add(a[i]); // Add to the unique elements list
                    System.out.println(a[i] + " is a unique number");
                }
            }
        }

        // Optional: Print all unique elements stored in the list
        System.out.println("Unique elements in the array: " + uniqueElements);
    }
}
