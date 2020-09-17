package com.flexon.JAVAString;

import java.util.Scanner;
public class Vowels {
	//make sure the system is not scanning from other sources
	private static Scanner sc; 
	
	public static void main(String[] args) {
		//prompt the user to type a sentence
		System.out.println("Type a sentence: "); 
		
		//take in the sentence from users
		sc = new Scanner(System.in); 
		String sentence = sc.nextLine(); 
		
		//to make sure every letter is in lower case for easier comparison
		sentence = sentence.toLowerCase(); 
		
		int count = 0;
		for (int i = 0; i<sentence.length(); i++) {
			char ch = sentence.charAt(i);
			if (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
				count++;
			}
		}
		System.out.println("There are "+ count + " vowels in this sentence.");

	}

}
