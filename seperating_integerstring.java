package com.Sample;

import java.util.ArrayList;

public class seperating_integerstring {
    public static void main(String[] args) {
        // The input string that contains both words and numbers
        String input = "mango,1234,apple,4567";
        
        // Split the input string into an array of strings using a comma as the separator
        String[] splitValues = input.split(",");
        
        // Create lists to store the separated values: one for words and one for numbers
        ArrayList<String> strings = new ArrayList<>();    // To store words like "mango" and "apple"
        ArrayList<Integer> integers = new ArrayList<>(); // To store numbers like 1234 and 4567
        
        // Loop through the array of split values
        for (String value : splitValues) {
            // Check if the current value is a number
            if (isNumeric(value)) {
                // If it is a number, convert it to an Integer and add it to the numberList
                integers.add(Integer.parseInt(value));
            } else {
                // If it is not a number, add it to the wordList
                strings.add(value);
            }
        }
        
        // Output the separated lists of words and numbers
        System.out.println("Words: " + strings);  // Prints the list of words (strings)
        System.out.println("Numbers: " + integers);  // Prints the list of numbers (integers)
    }

    // Helper function to determine if a string can be converted to a numeric value (integer)
    public static boolean isNumeric(String value) {
        try {
            // Attempt to convert the string to an integer
            Integer.parseInt(value);
            return true;  // If successful, the string is numeric
        } catch (NumberFormatException e) {
            return false; // If an error occurs, the string is not numeric
        }
    }
}
