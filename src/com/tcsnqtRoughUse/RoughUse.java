package com.tcsnqtRoughUse;
import java.util.*;

public class RoughUse {

	public static void main(String[] args) {

		String str = "HI HELLO WELCOME";

		String []word = str.split("\\s+");

		StringBuilder result = new StringBuilder();

		for (String words:word) {
			result.append(new StringBuilder(words).reverse()).append(" ");
		}

		String reversed = result.toString().trim();

		System.out.println(reversed);
	}
}







