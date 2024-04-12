package com.tcsnqt.twoarrays;

import java.util.Arrays;

public class TwoArraysAreEqualOrNot {
	
	public static void main (String[]args) {
		
		int a[]= {1,2,3};
		int b[]= {1,2,3};
		
		Boolean status = Arrays.equals(a,b);
		
		if (status==true) {
			System.out.println("TWO ARRAYS ARE EQUAL");
		}
		
		else {
			System.out.println("TWO ARRAYS ARE NOT EQUAL");
		}
	}

}
