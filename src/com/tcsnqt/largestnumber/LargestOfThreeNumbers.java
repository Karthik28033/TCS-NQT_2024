package com.tcsnqt.largestnumber;

public class LargestOfThreeNumbers {
	
	public static void main (String[]args) {
		int a=11,b=22,c=33;
		
		if (a>b && a>c) {
		System.out.println(a + " IS THE LARGEST NUMBER COMPARED TO "+b+" AND "+c);
		}
		
		else if (b>a && b>c) {
			System.out.println(b + " IS THE LARGEST NUMBER COMPARED TO "+a+" AND "+c);
			}
		
		else {
			System.out.println(c + " IS THE LARGEST NUMBER COMPARED TO "+a+" AND "+b);
			}
		
	
	}

}
