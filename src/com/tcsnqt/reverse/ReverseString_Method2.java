package com.tcsnqt.reverse;

public class ReverseString_Method2 {
	
	/* STRING BUFFER */
	
	public static void main (String[]args) {
		
		String word = "ABCD";
		StringBuffer rev;
		StringBuffer sb= new StringBuffer(String.valueOf(word));
		rev= sb.reverse();
		
		System.out.println("REVERSE OF STRING IS : " + rev);
	}

}
