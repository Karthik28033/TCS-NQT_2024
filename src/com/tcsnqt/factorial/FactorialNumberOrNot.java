package com.tcsnqt.factorial;

public class FactorialNumberOrNot {
public static void main (String[]args) {
	
	int num =3;
	int factorial=1;
	
	for (int i=1; i<=num; i++) {
		factorial = factorial*i;
	}
	System.out.println("FACTORIAL OF "+ num +" "+ "IS: " + factorial);
}
}
