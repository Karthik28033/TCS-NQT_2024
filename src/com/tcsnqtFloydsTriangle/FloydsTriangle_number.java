package com.tcsnqtFloydsTriangle;
import java.util.*;

public class FloydsTriangle_number {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of rows: ");
	        int numRows = scanner.nextInt();
	        scanner.close();

	        // Print Floyd's Triangle
	        printFloydTriangle(numRows);
	    }

	    public static void printFloydTriangle(int numRows) {
	        int num = 1;
	        for (int i = 1; i <= numRows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(num + " ");
	                num++;
	            }
	            System.out.println();
	        }
	    }

}
