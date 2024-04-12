package com.tcsnqt.palindrome;

public class PalindromeNumber {
	
	public static void main (String[]args) {
		
		int num= 1221;
		int newnum = num;
		
		int rev = 0;
		while (num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		
		if (newnum==rev) {
		System.out.println("GIVEN NUMBER"+ " "+newnum + " IS PALINDROME NUMBER");	
		}
		
		else {
			System.out.println("GIVEN NUMBER"+ " "+newnum + " IS NOT A PALINDROME NUMBER");
		}
	}

}
