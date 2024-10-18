//create a method which accepts array and return sum of all the elements in the array
package com.Sample;

public class sumofelementsin_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5};
		System.out.println("Length of an array is "+array.length);
		
		int total = sumarray(array);
		System.out.println(total);
	}

	private static int sumarray(int[] array) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		return sum;
	}

}
