package com.tcsnqtlcm;
import java.util.*;

public class LCM_OfTwoNumbers {
	
	public static int gcd(int a, int b) {
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}
	
	public static int lcm(int a, int b) {
	return (a*b)/gcd(a,b);	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENTER FIRST NUMBER: ");
		int num1= sc.nextInt();
		
		System.out.print("ENTER SECOND NUMBER: ");
		int num2= sc.nextInt();
		
		int result =lcm(num1,num2);
		
		System.out.println("LCM OF "+ num1+" AND "+ num2 +" IS: "+ result);
		
		
	}
}

