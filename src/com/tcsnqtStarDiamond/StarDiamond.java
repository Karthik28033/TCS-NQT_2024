package com.tcsnqtStarDiamond;

public class StarDiamond {
	
	public static void main(String[] args) {
        int n = 5; // Adjust the value of n to change the size of the pattern
        printPattern(n);
    }

    public static void printPattern(int n) {
        // Upper half of the pattern
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the pattern
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i; j < n - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
