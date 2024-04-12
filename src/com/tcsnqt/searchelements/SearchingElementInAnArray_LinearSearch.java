package com.tcsnqt.searchelements;

public class SearchingElementInAnArray_LinearSearch {
	
	public static void main(String[] args) {
		int a[]= {10,20,30,50,50};
		int search = 40;
		boolean flag=false;
		
		for(int i=0; i<a.length; i++) {
			if (search==a[i]) {
				System.out.println("ELEMENT INDEX IS: " + i);
				flag = true;
				break;
			}
			
		}
		
		if(flag==false) {
			System.out.println("ELEMENT IS NOT FOUND");
		}
	}

}
