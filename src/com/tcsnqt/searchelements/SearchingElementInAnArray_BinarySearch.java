package com.tcsnqt.searchelements;

public class SearchingElementInAnArray_BinarySearch {
	
	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		
		int lowest= 0;
		int highest= a.length-1;
		
		int find=50;
		
		boolean flag=false;
		
		while(lowest<=highest) {
			int middle = (lowest+highest)/2;
			
			if(a[middle]==find) {
				System.out.println("ELEMENT IS FOUND");
				flag=true;
				break;
			}
			if(a[middle]<find) {
				lowest=middle+1;
			}
			
			if(a[middle]>find) {
				highest=middle-1;
			}
		}
		if(flag==false) {
			System.out.println("ELEMENT IS NOT FOUND");
		}
	}

}
