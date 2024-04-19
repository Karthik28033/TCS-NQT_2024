package com.tcsnqtpyramid;

import java.util.Scanner;

public class InvertedHalfPyramidAlphabets {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.print("ENTER NUMBER OF ROWS FOR PYRAMID: ");
		int row = sc.nextInt();
		char alphabets ='A';


		for (int i=row; i>0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(alphabets+ " ");
				alphabets++;
			}

			System.out.println( );
		}

		sc.close();
	}

}
