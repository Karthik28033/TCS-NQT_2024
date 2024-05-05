package com.tcsnqt.ascii;

import java.util.Scanner;

public class AsciiValue {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	
		System.out.println("ENTER CHARACTER : ");
		char c= sc.next().charAt(0);
		
		int ascii = (int)c;
		
		System.out.print("ASCII VALUE OF " + c + " IS :" + ascii);
		
		
	}

}
