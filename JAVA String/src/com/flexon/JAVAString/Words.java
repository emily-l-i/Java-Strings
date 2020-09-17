package com.flexon.JAVAString;

import java.util.Scanner;

public class Words {

	//make sure the system is not scanning from other sources
	private static Scanner sc; 
	
	public static void main(String[] args) {
		//prompt the user to type a sentence
		System.out.println("Type a sentence: "); 
		System.out.println("(Without a space in the beginning or at the end of the sentence. Have one and only one space in between two words.)");
		
		//take in the sentence from users
		sc = new Scanner(System.in); 
		String str = sc.nextLine(); 
		
		//the case of no words in the input sentence
		if (str ==null || str.isEmpty()) {
			System.out.println("There are 0 words in this sentence.");
		}
		
		//initialize word count as 0
		int count = 0;
		
		//have ch[] as a storage of each character of the input sentence
		char ch[] =new char[str.length()]; 
		
		boolean isWord=true;
		for (int i = 0; i<str.length(); i++) {
			ch[i]=str.charAt(i);
			
			//if the ch is a letter, isWord is true
			if (Character.isLetter(ch[i]) && i!=(str.length()-1)){
				isWord=true;
			}
			
			//if the ch is not a letter and there have been letters/words before, word count increment, and change isWord to false
			else if (!Character.isLetter(ch[i])&& isWord) {
				count++;
				isWord=false;
			}
			
			//when we reached to the last word of this sentence, if the last word is a number or a symbol, the word count won't increment; otherwise, it will
			else if (Character.isLetter(ch[i]) && i==(str.length()-1)) {
				count++;
			}
			
			
		}
		System.out.println("This sentence contains "+count+ " word(s).");

	}
}