package com.tcsnqt.maxandmin;

public class MaximumAndMinimumElementInAnArray {
	public static void main(String[]args) {
		
		int a[]= {7,1,151,22};
		
		int max=a[0];
		int min=a[0];
		
		for(int i=1; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
			
			else if(a[i]<min) {
			min =a[i];	
			}
		}
		System.out.println("THE MAXIMUM ELEMENT IN AN ARRAY IS: " + max);
		System.out.println();
		System.out.println("THE MINIMUM ELEMENT IN AN ARRAY IS: " + min);
	}
}
