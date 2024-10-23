package com.Sample;

/**
 * Program to count the number of vowels and consonants in a given string.
 * The program also identifies spaces and prints whether each character is a vowel, consonant, or space.
 */
public class countconsonentsvowels2 {

    public static void main(String[] args) {
        // Input string to analyze
        String str = "My name is Kasa Rajesh";
        
        // Convert the string to lowercase to handle both uppercase and lowercase letters uniformly
        str = str.toLowerCase();
        
        // Initialize counters for vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;
        
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Extract each character from the string
            char ch = str.charAt(i);
            
            // Check if the character is a vowel (a, e, i, o, u)
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++; // Increment vowel count if it's a vowel
                System.out.println(ch + " is one of the vowels in the given string.");
            }
            // Check if the character is a space
            else if (ch == ' ') {
                System.out.println("Space detected in the given string.");
            }
            // If it's neither a vowel nor a space, it is considered a consonant
            else {
                consonantCount++; // Increment consonant count
                System.out.println(ch + " is one of the consonants in the given string.");
            }
        }
        
        // Print the total count of vowels and consonants
        System.out.println("Total vowel count in the string is: " + vowelCount);
        System.out.println("Total consonant count in the string is: " + consonantCount);
    }
}
