package com.tcsnqt.sorting;

import java.util.Arrays;

public class BubbleShort {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		
		System.out.println("BEFORE SORTING " +  Arrays.toString(a));
		
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length-1; j++) {
				
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("");
		System.out.println("AFTER SORTING " + Arrays.toString(a));
	}

}
