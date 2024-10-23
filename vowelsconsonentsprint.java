//checking the character in a string is a vowel or consonennt and mentioning the count of vowels and consonents
// Package declaration
package com.Sample;

// Public class definition
public class vowelsconsonentsprint {

    // Main method: entry point of the program
    public static void main(String[] args) {
        // Initialize a string with sample text
        String str = "Hello World!";
        
        // Call the method to print vowels and consonants from the given string
        printVowelsAndConsonants(str);
    }

    // Method to print vowels and consonants from a given string
    public static void printVowelsAndConsonants(String str) {
        // Convert the string to lower case to handle case insensitivity
        str = str.toLowerCase();
        int consonentcount=0;
        int vowelcount=0;
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the current character
            
            // Check if the character is a consonant
            if (isConsonant(ch)) {
                // Print the consonant
                System.out.println(ch + " is a Consonant");
                consonentcount++;
            } 
            // Check if the character is a vowel
            else if (isVowel(ch)) {
                // Print the vowel
                System.out.println(ch + " is a Vowel");
                vowelcount++;
            }
            
        }
        
        System.out.println("String having "+ consonentcount +"consonents.");
        System.out.println("String having "+ vowelcount +"vowels.");
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        // Check if the character is a letter and one of the vowels
        return Character.isLetter(ch) && (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    // Helper method to check if a character is a consonant
    public static boolean isConsonant(char ch) {
        // Check if the character is a letter and not a vowel
        return Character.isLetter(ch) && !isVowel(ch);
        //return Character.isLetter(ch) && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}
