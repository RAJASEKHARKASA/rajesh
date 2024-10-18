//count number of characters in a given string

package com.Sample;

public class countnumberofchars_string {

    public static void main(String[] args) {
        // Count occurrences of the character 'a' in the string "Raajjjesh"
        int count = countOfOccurrences("Raajjjesh", 'a');
        System.out.println("Count of char is " + count);
    }

    private static int countOfOccurrences(String string, char character) {
        // Initialize a count variable to keep track of occurrences
        int count = 0;

        // Loop through each character in the string
        for (int i = 0; i < string.length(); i++) {
            // Check if the current character matches the target character
            if (string.charAt(i) == character) {
                count++; // Increment the count if there's a match
            }
        }
        return count; // Return the final count
    }
}

