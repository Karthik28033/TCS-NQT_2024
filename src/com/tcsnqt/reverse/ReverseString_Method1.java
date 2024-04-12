package com.tcsnqt.reverse;

public class ReverseString_Method1 {
	
	public static void main (String[]args) {
	String word = "ABCD";
	String rev="";
	
	int length = word.length();
	word.charAt(0);
	
	for (int i=length-1; i>=0; i--) {
		rev= rev + word.charAt(i);
	}
	
	System.out.println("REVERSE OF WORD IS ;" + rev);
	}

}
