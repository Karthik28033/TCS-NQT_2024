package com.tcsnqtquestions;

public class Tcs_Question1 {
	
	/* Given a string S(input consisting) of '*' and '#. The length of the string is variable. The task is to find the minimum number of '*' or '# to make it a valid string. The string is considered valid if the number '*' of and '#' are equal. The * and '# can be at any position in the string.

	Note: The output will be a positive or negative integer based on number of ' and '#' in the input string. */
	
	public static int minChangesToMakeValid(String s) {
        int countStar = 0;
        int countHash = 0;

        // Count the number of '*' and '#'
        for (char c : s.toCharArray()) {
            if (c == '*') {
                countStar++;
            } else if (c == '#') {
                countHash++;
            }
        }

        // Calculate the difference between the counts
        int difference = countStar - countHash;

        // Return the absolute difference
        return Math.abs(difference);
    }

	
	public static void main(String[] args) {
		
		String input = "**##*";
        int minChanges = minChangesToMakeValid(input);
        System.out.println("Minimum changes required: " + minChanges);
		
		
	}

}
