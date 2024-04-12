package com.tcsnqt.evenoroddnumber;

public class EvenOrOddNumberInAnArray {
	public static void main(String[]args) {
		
		int a[] = {1,4,7,2,5,8,3,6,9};
		int oddcount=0;
		int evencount=0;
		
		for(int i=0; i<a.length; i++) {
		if(a[i]%2==0) {
			evencount++;
		}
		else {
			oddcount++;
		}
		}
		System.out.println("ODD NUMBERS COUNT IS:"+ oddcount);
		System.out.println("EVEN NUMBERS COUNT IS:"+ evencount);
	}

}
