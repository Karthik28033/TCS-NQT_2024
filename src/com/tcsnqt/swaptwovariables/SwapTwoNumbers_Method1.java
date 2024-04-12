package com.tcsnqt.swaptwovariables;

public class SwapTwoNumbers_Method1 {
	
	public static void main(String[]args) {
		
		/* USE THIRD VARIABLE*/
		
		int a= 10,b=20;
		System.out.println("BEFORE SWAP" + ": a=" +a + ", b=" +b);
		
		int c= a;
		a=b;b=c;
		System.out.println("AFTER SWAP" + ": a=" +a + ",b=" +b);
		
	}

}
