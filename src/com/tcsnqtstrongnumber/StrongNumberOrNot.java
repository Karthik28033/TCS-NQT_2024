package com.tcsnqtstrongnumber;
import java.util.*;

public class StrongNumberOrNot {
	
	public static int factorial(int num) {
		if(num==0) {
			return 1;
		}
		else {
			return num*(factorial(num-1));
		}
		
	}
	
	public static boolean strongnumber(int num) {
		
		int temp=num;
		int sum=0;
		
		while(num>0) {
		sum +=  factorial(num%10);
		num=num/10;
		}
		
		return sum==temp;
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("ENTER NUMBER: ");
		int num = sc.nextInt();
		
		if(strongnumber(num)) {
			System.out.println(num + " IS A STRONG NUMBER");
		}
		
		else {
			System.out.println(num + " IS NOT A STRONG NUMBER");
		}
		
	}

}
