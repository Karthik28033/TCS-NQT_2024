package com.tcsnqtleapyearornot;
import java.util.*;

public class LeapYearOrNot {

	public static void formula(int a) {
	
		if(a!=0 && a%4==0) {
			System.out.println("LEAP YEAR");
		}
		
		else {
			System.out.println("NOT LEAP YEAR");
		}
		
		/*return a;*/
		
	}
	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("ENTER YEAR: ");
		int year = sc.nextInt();
		
		formula(year);
	}
}
