package com.tcsnqtquestions;

import java.util.*;

/* Strong Numbers are the numbers whose sum of factorial of digits is equal to the original number. Given a number, check if it is a Strong Number or not.

Examples:

Input: n 145

Output: Yes

Sum of digit factorials 11 + 41 + 51 1+24+120 = 145

Input: n 534

Output: No        */

public class Tcs_Question6 {
	
	 static int factorial(int n) {
	        if (n == 0 || n == 1)
	            return 1;
	        else
	            return n * factorial(n - 1);
	    }

	    // Function to check if a number is a Strong Number
	    static boolean isStrong(int n) {
	        int sum = 0;
	        int temp = n;
	        while (temp > 0) {
	            int digit = temp % 10;
	            sum += factorial(digit);
	            temp /= 10;
	        }
	        return sum == n;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        scanner.close();

	        if (isStrong(number)) {
	            System.out.println("Output: Yes");
	        } else {
	            System.out.println("Output: No");
	        }
	    }

}
