package com.tcsnqtquestions;

/* Array Problems !!    -----(Kadane’s Algorithm)-----

Maximum Subarray

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]

Output: 6 

Explanation : [4,-1,2,1] has the largest sum = 6 */

public class Tcs_Question2 {

	public static int maxSubArray(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;

		int maxSum = nums[0];
		int currentSum = nums[0];

		for (int i = 1; i < nums.length; i++) {
			currentSum = Math.max(nums[i], currentSum + nums[i]);
			maxSum = Math.max(maxSum, currentSum);
		}

		return maxSum;

	}
	
	 public static void main(String[] args) {
	        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	        System.out.println("Maximum subarray sum: " + maxSubArray(nums));
	    }
}
