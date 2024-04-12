package com.tcsnqt.removespacejunk;

public class RemoveJunkOrSpecialCharacter {
	
	public static void main(String[] args) {
		
		String a= "HELLO!@@###$AND WELCOME$%%^&&*123456789";
		a=a.replaceAll("[^a-zA-Z0-9]"," ");
		
		System.out.println(a);
	}

}
