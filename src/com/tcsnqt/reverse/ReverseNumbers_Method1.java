package com.tcsnqt.reverse;
import java.util.Scanner;

public class ReverseNumbers_Method1 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER NUMBER :");
		int number = sc.nextInt();
		
		int rev = 0;
		while(number!=0) {
			rev= rev*10 + number%10;
			number = number/10;
		}
		System.out.println("REVERSE OF NUMBER IS : " + rev);
	}

}
