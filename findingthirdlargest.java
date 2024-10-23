//write a program to find third largest number in an given arrays
package com.Sample;

public class findingthirdlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,1,3,4,5,6};
		int[] b = {11,22,33,44,55,66,77};
		System.out.println("Third largest number in array 'a' is: " + getthirdlargest(a, 6));
        System.out.println("Third largest number in array 'b' is: " + getthirdlargest(b, 7));
    }

	private static int getthirdlargest(int[] a, int total) {
		// TODO Auto-generated method stub
		int temp;
		for (int i=0;i<total;i++) {
			for(int j=i+1; j<total; j++) {
				if (a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-3];
	}

}
