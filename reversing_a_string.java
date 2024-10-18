package com.Sample;

public class reversing_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ipword = "My name is Rajesh";
		String opword = "";
		
		//System.out.println(input.length()-1);
		
		for(int i=ipword.length()-1; i>=0; i--) {
			opword = opword+ipword.charAt(i);
		}
		
		System.out.println(opword);

	}

}
