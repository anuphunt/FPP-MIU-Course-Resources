
package Palindrome;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		
		String word = sc.nextLine().toLowerCase();
		String reverseWord = "";
		
		for(int i = word.length()-1; i>=0; i--) {
			reverseWord += word.charAt(i);
		}
		
		if(word.equals(reverseWord)) {
			System.out.println("The word you entered is a palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
		
	}
}
