package com.tcsnqtpascalstriangle;
import java.util.*;

public class PascalsTriangle_half {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's triangle: ");
        int numRows = sc.nextInt();

        // Generating Pascal's triangle
        int[][] triangle = new int[numRows][];
        for (int i = 0; i < numRows; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1; // First element of each row is always 1
            triangle[i][i] = 1; // Last element of each row is always 1
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        // Printing Pascal's triangle
        System.out.println("Pascal's Triangle:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
