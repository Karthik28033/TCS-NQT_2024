package com.tcsnqtpascalstriangle;

import java.util.Scanner;

public class PascalsFullTriangle {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        scanner.close();

        // Print Pascal's Triangle
        printPascalTriangle(numRows);
    }

    public static void printPascalTriangle(int numRows) {
        for (int i = 0; i < numRows; i++) {
            // Print spaces for formatting
            for (int j = 0; j < numRows - i - 1; j++) {
                System.out.print(" ");
            }
            
            int num = 1;
            // Print numbers for the current row
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            
            // Move to the next line for the next row
            System.out.println();
        }
    }
}
