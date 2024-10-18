package com.Sample;

public class maxdiffbetweenadjacentelementsinarray_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//finding difference
				int array[]= {6,5,3,8,7};
				int dif=0;
				
				System.out.println(array[0]);
				
				for (int i=0; i<array.length-1; i++) {
					if (array[i+1]-array[i]>dif) {
						dif=array[i+1]-array[i];
					}
				}
				System.out.println("max difference between the adjacent index is " + dif);

				
				//sorting
				int temp=0;
				for (int i=0; i<array.length; i++) {
					for (int j=i+1; j<array.length; j++) {
						if (array[i]>array[j]) {
							temp=array[i];
							array[i]=array[j];
							array[j]=temp;
						}
					}
				}
				for(int i=0; i<array.length; i++) {
					System.out.println(array[i]);
				}
	}

}
