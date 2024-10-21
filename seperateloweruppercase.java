//Write a program to seperate and print upper and lower case characters from a given string
package com.Sample;

public class seperateloweruppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "my name is kasa rajesh MY NAME IS KASA RAJESH";
		String upper = "";
		String lower= "";
		
		for (int i=0; i<str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				upper = upper+str.charAt(i);
			}
			else if(Character.isLowerCase(str.charAt(i))) {
				lower = lower+str.charAt(i);
			}
		}
		
		System.out.println("Lower Case: "+lower);
		System.out.println("Upper Case: "+upper);
		

	}


}
