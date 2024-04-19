package com.tcsnqtareaoftriangle;
import java.util.*;

public class AreaOfTriangle {
	
	public static int formula (int a, int b) {
		
		 int c = (int) (0.5*a*b);
		 return c;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("ENTER BASE OF THE TRIANGLE: ");
		int a = sc.nextInt();
		
		System.out.print("ENTER HEIGHT OF THE TRIANGLE: ");
		int b = sc.nextInt();
		
		int c = formula(a,b);
		
		System.out.print("AREA OF TRIANGLE IS: " +c);
	}

}
