package com.Sample;

public class multiplicationof5_withoutmulitplyoperartor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = multiply(5,20);
		System.out.println(result);

	}

	private static int multiply(int i, int j) {
		// TODO Auto-generated method stub
		int k=1, sum=0;
		while (k<=j) {
			sum=sum+i;
			k++;
			System.out.println(sum);
		}
		return sum;
	}

}
