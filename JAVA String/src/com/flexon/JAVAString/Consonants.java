package com.flexon.JAVAString;

import java.util.Scanner;
public class Consonants {
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
		
		//to count the consonants;
		int count = 0; 

		for (int i = 0; i<sentence.length(); i++) {
			char ch= sentence.charAt(i);
			
			//this condition specifies that when a character is not a, e, i, o, u, 
			//and it is a character instead of a digit or space;
			if (ch!='a'&&ch!='e'&& ch!='i'&& ch!='o'&&ch!='u'&&ch>='a' && ch<='z'){				
				count++;
			}
		}
		System.out.println("There are "+ count + " consonants in this sentence.");
		System.out.println(sentence.replaceAll("[bcdfghjklmnpqrstvwxyz]", "*"));

	}

}

