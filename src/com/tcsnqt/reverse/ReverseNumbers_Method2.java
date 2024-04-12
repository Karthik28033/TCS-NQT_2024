package com.tcsnqt.reverse;

import java.util.Scanner;

public class ReverseNumbers_Method2 {
	
public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER NUMBER :");
		int number = sc.nextInt();
		
		StringBuffer rev;
		StringBuffer sb= new StringBuffer(String.valueOf(number));
		rev = sb.reverse();
		
		System.out.println("REVERSE OF NUMBER IS : "+ rev);
	}

}
