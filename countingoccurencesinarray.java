package com.Sample;
import java.util.Arrays;

public class countingoccurencesinarray {
    public static void main(String[] args) {
        // Sample array
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 6, 6, 7, 8, 8, 8};

        // Sort the array
        //Arrays.sort(arr);

        // Initialize variables
        int currentElement = arr[0];
        int count = 1;

        // Iterate through the sorted array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == currentElement) {
                // If the element is the same as the previous one, increment the count
                count++;
            } else {
                // If the element changes, print the occurrence of the previous element
                System.out.println("Element " + currentElement + " occurs " + count + " times.");
                // Update the current element and reset the count
                currentElement = arr[i];
                count = 1;
            }
        }

        // Print the occurrence of the last element
        System.out.println("Element " + currentElement + " occurs " + count + " times.");
    }
}
