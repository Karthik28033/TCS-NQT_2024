package com.tcsnqt.fibonacciseries;
import java.util.Scanner;
public class FibonacciSeries {
	
	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER NUMBER: ");
		int n=sc.nextInt();
		
		int num1=0;
		int num2=1;
		
		for(int i=0;i<=n;i++) {
			System.out.print(num1+" ");
			int num3 = num1+num2;
			num1=num3;
			num3=num2;
		}
		
	
		
	}

}
