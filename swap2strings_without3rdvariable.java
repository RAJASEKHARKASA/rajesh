package com.Sample;

public class swap2strings_without3rdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Rajesh";
		String s2 = "Kasa";
		
		s1 = s1+s2;
		
//		System.out.println(s1.length());
//		System.out.println(s2.length());
		
		s2 = s1.substring(0, s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		
		System.out.println("s1 = "+ s1);
		System.out.println("s2 = "+ s2);

	}

}
