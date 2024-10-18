//swapping 2 numbers using the temp and without using temp variables

package com.Sample;

public class swaptemp_withouttemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5, b=6, temp=0;
		int c=5, d=6;
		
		//with temp
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		
		
		//without temp
		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println(c);
		System.out.println(d);	

	}

}
