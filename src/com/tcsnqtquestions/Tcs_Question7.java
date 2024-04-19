package com.tcsnqtquestions;

import java.util.*;

/* A party has been organised on cruise. 
  The party is organised for a limited time(T). 
  The number of guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as elements of the array. 
  The task ts to find the maximum number of guests present on the cruise at any given instance within T hours.

Example 1:

Input:

5 -> Value of T

• [7,0,5,1,3] -> E[], Element of E[0] to E[N-1], where input each element is separated by new

line

• [1,2,1,3,4] -> L[], Element of L[0] to L[N-1], while input each element is separate by new line.

Output:

8 -> Maximum number of guests on cruise at an instance.     */

public class Tcs_Question7 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the value of T
	        int T = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        // Input array E
	        int[] E = new int[T];
	        for (int i = 0; i < T; i++) {
	            E[i] = scanner.nextInt();
	        }
	        scanner.nextLine(); // Consume newline

	        // Input array L
	        int[] L = new int[T];
	        for (int i = 0; i < T; i++) {
	            L[i] = scanner.nextInt();
	        }

	        // Calculate maximum number of guests
	        int maxGuests = calculateMaxGuests(T, E, L);
	        System.out.println(maxGuests);
	    }

	    // Function to calculate maximum number of guests
	    private static int calculateMaxGuests(int T, int[] E, int[] L) {
	        int[] timeline = new int[24]; // Assuming party lasts for 24 hours
	        int maxGuests = 0;
	        int currentGuests = 0;

	        // Populate timeline array based on entering and leaving guests
	        for (int i = 0; i < T; i++) {
	            timeline[E[i]]++; // Increment for entering guests
	            timeline[L[i]]--; // Decrement for leaving guests
	        }

	        // Calculate maximum number of guests using timeline array
	        for (int i = 0; i < 24; i++) {
	            currentGuests += timeline[i];
	            if (currentGuests > maxGuests) {
	                maxGuests = currentGuests;
	            }
	        }

	        return maxGuests;
	    }

}
