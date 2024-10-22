package com.Sample;

import java.util.Scanner;

public class tableprinting_scanner {

    public static void main(String[] args) {
        // Create an instance of the Scanner class to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter an integer for which the multiplication table will be printed
        System.out.print("Enter the number to print multiplication table: ");
        int N = sc.nextInt();  // Read the input number from the user
        
        // Display the entered value
        System.out.println("Entered value: " + N);
        
        // Loop from 1 to 10 to generate and print the multiplication table
        for (int i = 1; i <= 10; i++) {
            int result = N * i;  // Calculate the product of N and the current value of i

            // Print the formatted result of the multiplication
            System.out.printf("%d * %d = %d%n", N, i, result);
        }

        // Close the scanner to avoid resource leaks
        sc.close();
    }
}
