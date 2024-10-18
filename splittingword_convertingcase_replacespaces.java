package com.Sample;

public class splittingword_convertingcase_replacespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="My name is Kasa Rajesh";
		String words[] = input.split(" ");
		System.out.println(words[3]);
		
		
		
		//Detecting the lower & upper
		for (int i=0; i<input.length(); i++) {
			if (Character.isLowerCase(input.charAt(i))) {
				System.out.println("Lowercase letter in the sentence is "+input.charAt(i));
				
			}
			else if(Character.isUpperCase(input.charAt(i))) {
				System.out.println("Uppercase letter in the sentence is "+input.charAt(i));
			}
		}
		
		//Converting the lower into upper and viceversa
		StringBuffer replace = new StringBuffer(input);
		for (int i=0; i<input.length(); i++) {
			if (Character.isLowerCase(input.charAt(i))) {
				replace.setCharAt(i,Character.toUpperCase(input.charAt(i)));	
			}
			else if(Character.isUpperCase(input.charAt(i))) {
				replace.setCharAt(i,Character.toLowerCase(input.charAt(i)));
			}
		}
		System.out.println("After Conversion "+ replace);
		
		
		//Removing white spaces using regex
		String withoutspaces = input.replaceAll("\\s+", "---");
		System.out.println(withoutspaces);

	}



}
