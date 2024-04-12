package com.tcsnqt.missingnumber;

public class MissingNumberInAnArray {
	
	public static void main (String[]args) {
		
		int a[]= {1,4,3,5};
		int sum1=0;
		int sum2=0;
		
		for (int i=0; i<a.length; i++) {
			sum1= sum1+a[i];
		}
		
		for (int i=1; i<=5; i++) {
			sum2=sum2+i;
		}
		
		
		int sum3 = sum2-sum1;
		
		System.out.println("MISSING NUMBERS IN AN ARRAY IS:"+sum3);
	}

}
