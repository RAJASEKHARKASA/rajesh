package com.Sample;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Radar";
		String temp="";
		
		//System.out.println(s1.length());
		
		for (int i=s1.length()-1; i>=0; i--) {
			temp=temp+s1.charAt(i);
		}
		
		System.out.println("Reversed string is "+temp);
		
		//This condition checks if the original string s1 (converted to lowercase) is equal to the reversed string temp (also converted to lowercase).
		//The use of equalsIgnoreCase ensures that the comparison is case-insensitive.
		
		if(s1.toLowerCase().equalsIgnoreCase(temp.toLowerCase())) {
			System.out.println(temp+ " is a palindrome");
		} else {
			System.out.println(temp+ " is not a palindrome");
		}

	}

}
