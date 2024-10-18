//program for priting * pyramid patter as below
//*
//**
//***
//****
//*****

package com.Sample;

public class testpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("*");
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.println("*");
				//System.out.println("\t");
			}
			System.out.println();
		}

	}

}
