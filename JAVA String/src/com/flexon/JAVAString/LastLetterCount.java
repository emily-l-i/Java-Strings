package com.flexon.JAVAString;

import java.util.Scanner;
public class LastLetterCount {
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
			
		//extract words from the input sentence
		String words[] = sentence.split(" ");
		
		//check if any word ends with s, using .endsWith method
		int sCount = 0;
		for (int i=0; i<words.length; i++) {
			if (words[i].endsWith("s")) {
					sCount++;
					while (sCount == 1) {
						int sWord = i;
					}
					}
			}
		System.out.println("This sentence contains "+sCount+" word(s) that ends with 's'.");
	
		//check if any word ends with y, using .endsWith method
		int yCount = 0; 
		for (int j=0; j<words.length; j++) {
			 if (words[j].endsWith("y")) {
					yCount++;
					while (yCount == 1) {
						int yWord = j;
					}
					}
			 }
		System.out.println("This sentence contains "+yCount+" word(s) that ends with 'y'.");
						
		String newSentence = sentence.replace(words[i],words[j]);
		
		System.out.println("The new sentence is " + newSentence  + " .");
		
	}
}
	

