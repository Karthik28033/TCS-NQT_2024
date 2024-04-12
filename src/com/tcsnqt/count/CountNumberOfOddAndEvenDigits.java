package com.tcsnqt.count;

public class CountNumberOfOddAndEvenDigits {
	
	/* COUNT NUMBER OF EVEN AND ODD DIGITS IN A NUMBER */
	
	public static void main(String[]Args) {
		
		int num=142535;
		int Even_count=0;
		int Odd_count=0;
		
		while(num>0) {
			int rem=num%10;
			
			if(rem%2==0) {
				Even_count++;
			}
			else {
				Odd_count++;
			}
			num=num/10;
		}
		System.out.println("EVENT NUMBER COUNT IS: "+Even_count );
		System.out.println("ODD"
				+ " NUMBER COUNT IS: "+Odd_count );
		
	}

}
