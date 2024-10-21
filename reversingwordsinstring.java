// Package declaration
package com.Sample;

// Public class definition
public class reversingwordsinstring {

    // Main method: entry point of the program
    public static void main(String[] args) {
        // Initialize a string with the words to be reversed
        String str = "my name is kasa rajesh";
        
        // Split the string into an array of words using space as the delimiter
        String[] words = str.split(" ");
        
        // Create a StringBuilder to build the reversed string
        StringBuilder reverse = new StringBuilder();
        
        // Loop through the array of words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            // Append the current word to the StringBuilder
            reverse.append(words[i]);
            
            // If it's not the last word, append a space after it
            if (i != 0) {
                reverse.append(" ");
            }
        }
        
        // Print the final reversed string
        System.out.print(reverse.toString());
    }
}
