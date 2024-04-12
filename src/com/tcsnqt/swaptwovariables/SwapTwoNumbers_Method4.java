package com.tcsnqt.swaptwovariables;

public class SwapTwoNumbers_Method4 {
	
	public static void main (String[]args) {
		
		/* USE LOGICAL BITWISE XOR (^) */
			
			int a=22, b=33;
			System.out.println("BEFORE SWAP" + ": a=" +a + ", b=" +b);
			
			a= a^b; b=a^b; a=a^b;
			System.out.println("AFTER SWAP" + ": a=" +a + ", b=" +b);
		}

}
