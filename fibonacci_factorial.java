package com.Sample;

public class fibonacci_factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=0, n2=1, n3=0, count=6, fact=1;
		
		//fibonacci
		for (int i=1; i<count; i++) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
		
		//factorial
		for (int j=1; j<=count; j++) {
			fact = fact * j;
		}
		System.out.println("Factorial of a count number is "+fact);

	}

}
