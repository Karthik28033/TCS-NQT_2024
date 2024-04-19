package com.tcsnqtquestions;

/* Given an integer array Arr of size N the task is to find the count of elements whose value is greater than all of its prior elements.

Note: 1st element of the array should be considered in the count of the result 

For example,

Arr[]={7,4,8,2,9}

As 7 is the first element, it will consider in the result.

8 and 9 are also the elements that are greater than all of its previous elements.

Since total of 3 elements is present in the array that meet the condition.

Hence the output = 3. */

public class Tcs_Question5 {
	
	public static int countElements(int[] arr) {
        int count = 1; // First element is always considered
        int maxSoFar = arr[0]; // Initialize maxSoFar with the first element
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxSoFar) {
                count++; // Increment count if current element is greater than maxSoFar
                maxSoFar = arr[i]; // Update maxSoFar
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        int[] arr = {7, 4, 8, 2, 9};
        int result = countElements(arr);
        System.out.println("Output: " + result);
    }

}
