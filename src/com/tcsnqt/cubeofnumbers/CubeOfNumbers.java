package com.tcsnqt.cubeofnumbers;

public class CubeOfNumbers {

	public static int formula(int a, int b) {

		int sum=0;
		for(int i=a; i<=b; i++) {
			sum += i*i*i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int m=3 , n=5;
		int result = formula( m, n);
		System.out.println("SUM OF CUBE OF NUMBERS BETWEEN "+ m + " AND " + n + " IS :" + result);
	}

}
