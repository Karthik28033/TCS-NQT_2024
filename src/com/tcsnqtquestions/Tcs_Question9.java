package com.tcsnqtquestions;
import java.util.*;

/* One programming language has the following keywords that cannot be used as
identifiers:
break, case, continue, default, defer, else, for, func, goto, if, map, range, return,
struct, type, var
Write a program to find if the given word is a keyword or not
Input #1:
defer
Output:
defer is a keyword
Input #2:
While
Output:
While is not a keyword */

public class Tcs_Question9 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a word: ");
	        String word = scanner.nextLine();

	        if (isKeyword(word)) {
	            System.out.println(word + " is a keyword");
	        } else {
	            System.out.println(word + " is not a keyword");
	        }
	    }

	    public static boolean isKeyword(String word) {
	        String[] keywords = {"break", "case", "continue", "default", "defer", "else", "for", "func", "goto", "if", "map", "range", "return", "struct", "type", "var"};
	        
	        for (String keyword : keywords) {
	            if (keyword.equals(word)) {
	                return true;
	            }
	        }
	        
	        return false;
	    }
}



