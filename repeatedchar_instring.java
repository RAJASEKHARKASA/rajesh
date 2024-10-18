package com.Sample;

public class repeatedchar_instring {

    public static void main(String[] args) {
        String str = "welcome to my world";  // The string to search in
        int count = 0;                       // Counter for occurrences
        int startfrom = 0;                   // Starting index for search

        for (;;) {                           // Infinite loop (will break manually)
            int index = str.indexOf('o', startfrom); // Find index of 'o' starting from 'startfrom'
            if (index >= 0) {                // If 'o' is found
                count = count + 1;           // Increment the count
                startfrom = index + 1;       // Update start index to search for next 'o'
            } else {
                break;                       // Exit the loop if 'o' is not found
            }
        }
        
        // Print the results
        System.out.println("String: " + str);
        System.out.println("The 'o' character has come " + count + " times");
    }
}
