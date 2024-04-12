package com.tcsnqt.removespacejunk;

public class RemoveSpacesInString {

	public static void main(String[] args) {

		String a= " T  C  S - P  R  E  P  A  R  A  T  I  O  N  ";

		System.out.println(a);

		a=a.replaceAll("\\s","");
		
		System.out.println(" ");

		System.out.println(a);
	}

}
