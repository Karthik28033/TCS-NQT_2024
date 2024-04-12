package com.tcsnqt.reverse;

public class ReverseEachWordInString {
	public static void main(String[] args) {
        String str = "Hello World";
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        String reversed = result.toString().trim();
        System.out.println("Original string: " + str);
        System.out.println("String with reversed words: " + reversed);
    }
	}

