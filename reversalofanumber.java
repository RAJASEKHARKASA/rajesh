package com.Sample;

public class reversalofanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234;
		int rev = 0;
		
		while (num!=0) {
			int rem = num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reversal of a given number is "+rev);

	}

}
