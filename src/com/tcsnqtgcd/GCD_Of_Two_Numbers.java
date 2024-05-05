package com.tcsnqtgcd;
import java.util.*;

public class GCD_Of_Two_Numbers {
	
	public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner (System.in);
    	
    	System.out.print("ENTER FIRST NUMBER: ");
        int num1 = sc.nextInt();
        
        System.out.print("ENTER SECOND NUMBER: ");
        int num2 = sc.nextInt();
        
        int result = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
        
        sc.close();
    }

}
