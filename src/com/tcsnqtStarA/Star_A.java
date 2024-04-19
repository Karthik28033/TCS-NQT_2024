package com.tcsnqtStarA;
import java.util.*;
public class Star_A {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("ENTER ROW : ");
		int row = sc.nextInt();
		
		
		for(int i=0; i<row; i++) {
			for (int j=0; j<row-i-1; j++) {
				System.out.print(" ");
			}
			
			for(int k=0; k<2*i-1; k++) {
				if(k%2==0) {
					System.out.print("*");
				}
				
				else {
					System.out.print("A");
				}
			}
			System.out.println();
		}
	}
}
