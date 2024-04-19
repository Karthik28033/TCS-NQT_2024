package com.tcsnqtpyramid;

import java.util.Scanner;

public class InvertedFullPyramidStar {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of rows for the pyramid: ");
	        int row = scanner.nextInt();
	        
	        for (int i = row; i>=1; i--) {
	            for (int j = 1; j <= row - i; j++) {
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
