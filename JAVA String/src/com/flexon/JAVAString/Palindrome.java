package com.flexon.JAVAString;

import java.util.Scanner;
public class Palindrome {
	//make sure the system is not scanning from other sources
	private static Scanner sc; 
	
	//boolean function to return true or false for the result
	static boolean isPalindrome(String str) {
		int i=0; 
		int j=str.length()-1;
			
		//i starts from the beginning of the sentence, and j starts from the end of the sentence
			while (i<j) {
				if (str.charAt(i) != str.charAt(j)) {
					return false;
				}
				i++;
				j--;
			}
			return true;
		}

	public static void main(String[] args) {
		//prompt the user to type a word or a sentence
		System.out.println("Type a word or a sentence to check if it's a palindrome: "); 
				
		//take in user input
		sc = new Scanner(System.in); 
		String str = sc.nextLine(); 
						
		//to make sure every letter is in lower case for easier comparison
		str = str.toLowerCase(); 
				
		//if boolean returned true, system will print out Yes; otherwise, it will print out no
			if(isPalindrome(str)) {
				System.out.print("Yes");
			}
			else {
				System.out.print("No");
			}
	}
}
