package com.tcsnqt.palindrome;

public class PalindromeString {
	public static void main (String[]args) {
		
		String word = "DAD";
		String newword = word;
		String rev= "";
		
		int length =word.length();
		word.charAt(0);
		
		for(int i=length-1; i>=0; i--) {
		rev = rev+word.charAt(i);	
		}
		
		if(newword.equals(rev)) {
			System.out.println("GIVEN WORD"+ " "+ newword+ " IS PALINDROME");
		}
		else {
			System.out.println("GIVEN WORD"+ " "+ newword+ " IS NOT PALINDROME");
		}
		
	}

}
