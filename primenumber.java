package com.Sample;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m = 0, n = 7, flag = 0;  // Initialize variables
		m = n / 2;                   // Set m to half of n

		if (n == 0 | n == 1) {       // Check if n is 0 or 1
		    System.out.println(n + " is not a prime number");
		}

		for (int i = 1; i < m; i++) { // Loop from 1 to m
		    if (n % i == 0) {         // Check if n is divisible by i
		        System.out.println(n + " is not a prime number");
		        flag = 1;             // Set flag indicating n is not prime
		        break;                // Exit the loop
		    }
		}

		if (flag == 0) {              // If flag is still 0, n is prime
		    System.out.println(n + " is a prime number");
		}

	}

}
