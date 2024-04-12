package com.tcsnqt.swaptwovariables;

public class SwapTwoNumbers_Method5 {
	
public static void main (String[]args) {
		
		/* USE SINGLE STATEMENT) */
			
			int a=22, b=33;
			System.out.println("BEFORE SWAP" + ": a=" +a + ", b=" +b);
			
			b= a+b-(a=b);
			System.out.println("AFTER SWAP" + ": a=" +a + ", b=" +b);
		}

}
