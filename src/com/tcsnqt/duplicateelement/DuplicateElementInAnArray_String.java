package com.tcsnqt.duplicateelement;

public class DuplicateElementInAnArray_String {
	public static void main (String[]args) {
		
		String [] courses= {"JAVA","PYTHON","C","C++","HTML","JAVA","HTML"};
		
		for(int i=0;i<courses.length; i++) {
			for (int j=i+1; j<courses.length; j++) {
				if(courses[i]==courses[j]) {
					System.out.println("DUPLICATE ELEMENT IS: "+courses[i]);
				}
			}
		}
	}

}
