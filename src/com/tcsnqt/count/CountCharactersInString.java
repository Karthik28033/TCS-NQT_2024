package com.tcsnqt.count;

public class CountCharactersInString {
	
	public static void main(String[] args) {
		
		String word="JAVA IS A PROGRAMMING LANGUAGE";
		
		int length = word.length();
		
		int count= word.replaceAll("A","").length();
		
		int total = length-count;
		
		System.out.println("TOTAL COUNT IS :" + total);
	}

}
