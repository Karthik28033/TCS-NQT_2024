package com.tcsnqt.duplicateelement;

public class DuplicateElementInAnArray_number {
	public static void main(String[] args) {
		
		int a[]= {11,22,33,45,11,58,33};
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println("DUPLICATE NUMBER IS: " + a[i]);
				}
			}
		}
	}

}
