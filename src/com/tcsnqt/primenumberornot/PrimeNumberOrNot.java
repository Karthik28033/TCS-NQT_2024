package com.tcsnqt.primenumberornot;

public class PrimeNumberOrNot {

	public static void main (String[]args) {

		int number =21;
		int count=0;

		for (int i=1; i<=number; i++) {
			if(number%i==0) {
				count++;
			}
		}

		if (count==2) {
			/* count=2 , because number is only divisible by two numbers. eg: 13 is divisible by either 13/1 or 13/13. so count ==2 */  
			System.out.println(number + " IS PRIME NUMBER");
		}
		else {
			System.out.println(number + " IS NOT A PRIME NUMBER");
		}
	}

}
