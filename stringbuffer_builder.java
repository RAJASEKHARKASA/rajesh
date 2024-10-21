// Package declaration
package com.Sample;

// Public class definition
public class stringbuffer_builder {

    // Main method: entry point of the program
    public static void main(String[] args) {
        
        // Create a StringBuffer object initialized with "HELLO"
        StringBuffer sb = new StringBuffer("HELLO");
        
        // Append " WORLD" to the StringBuffer
        sb.append(" WORLD");
        // Print the current value of sb after appending
        System.out.println("When appended: " + sb);
        
        // Insert "she" at index 2 of the StringBuffer
        sb.insert(2, "she");
        // Print the current value of sb after insertion
        System.out.println("When inserted: " + sb);
        
        // Replace the substring from index 0 to 3 with "hel"
        sb.replace(0, 3, "hel");
        // Print the current value of sb after replacement
        System.out.println("When replaced: " + sb);
        
        // Delete the character at index 9 from the StringBuffer
        sb.deleteCharAt(9);
        // Print the current value of sb after deletion
        System.out.println("When deleted: " + sb);
        
        // Reverse the contents of the StringBuffer
        sb.reverse();
        // Print the current value of sb after reversing
        System.out.println("When reversed: " + sb);
        
        // Create a StringBuilder object initialized with "HELLO"
        StringBuilder sbb = new StringBuilder("HELLO");
        // Print the value of the StringBuilder
        System.out.println(sbb);
        
        // Comment explaining that StringBuilder is not thread-safe and is faster than StringBuffer
        // StringBuilder is not synchronized, making it more suitable for single-threaded scenarios
    }
}
