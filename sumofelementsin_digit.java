package com.Sample;

public class sumofelementsin_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=getsumofdigits(654);
		System.out.println(total);
	}
	
	public static int getsumofdigits(int num) {
		int sum=0;
		while (num!=0) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		return sum;
	}

}
