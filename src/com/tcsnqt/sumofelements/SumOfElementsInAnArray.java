package com.tcsnqt.sumofelements;

public class SumOfElementsInAnArray {
	
	public static void main(String[]args) {
		
		int array[]= {1,2,3,8};
		int sum=0;
		
		for (int i=0; i<array.length;i++) {
			sum=sum+array[i];
		
		}
		System.out.println("SUM OF ELEMENTS IN AN ARRAY IS: "+sum);
	}

}
