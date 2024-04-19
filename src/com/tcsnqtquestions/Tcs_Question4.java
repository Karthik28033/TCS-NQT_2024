package com.tcsnqtquestions;
import java.util.*;

/* LONGEST SUSTRING WITHOUT REPEATING CHARACTERS */

/* Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"

Output: 3

Explanation: The answer is "abc", with the length of 3.

Example 2:

Input: s = "bbbbb"

Output: 1 */

public class Tcs_Question4 {

	public static int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0) { 
			return 0;
		}

		int maxLength = 0;
		Map<Character, Integer> map = new HashMap<>();
		int start = 0;

		for (int end = 0; end < s.length(); end++) {
			char c = s.charAt(end);
			if (map.containsKey(c)) {
				start = Math.max(start, map.get(c) + 1);
			}
			map.put(c, end);
			maxLength = Math.max(maxLength, end - start + 1);
		}

		return maxLength;
	}

	public static void main(String[] args) {
		String s1 = "abcabcbb";
		System.out.println("Length of longest substring without repeating characters in '" + s1 + "': " + lengthOfLongestSubstring(s1)); // Output: 3

		String s2 = "bbbbb";
		System.out.println("Length of longest substring without repeating characters in '" + s2 + "': " + lengthOfLongestSubstring(s2)); // Output: 1
	}
}
