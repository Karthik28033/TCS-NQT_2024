package com.tcsnqt.sorting;

import java.util.Arrays;

public class SortElementsInAnArray_BuiltInMethod_2 {
	
	public static void main(String[] args) {
		
String a[]= {"A","D","F","B","E","C"};
		
		System.out.println("BEFORE SORTING " + Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println("AFTER SORTING " + Arrays.toString(a));
	}

}
