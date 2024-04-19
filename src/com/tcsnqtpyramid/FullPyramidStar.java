package com.tcsnqtpyramid;

import java.util.Scanner;

public class FullPyramidStar {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of rows for the pyramid: ");
	        int rows = scanner.nextInt();
	        
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print("  "); // Printing spaces
	            }
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                System.out.print("* "); // Printing stars
	            }
	            System.out.println(); // Moving to the next line
	        }
	        scanner.close();
	    }
}
