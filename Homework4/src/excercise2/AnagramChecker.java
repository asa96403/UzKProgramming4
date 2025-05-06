package excercise2;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

	public static void main(String[] args) {
		System.out.println("Welcome to Letter Soup Deluxe!");
		Scanner scanner = new Scanner(System.in);
		// Get two strings from the user
		System.out.print(" Enter the first string: ");
		String word1 = scanner.nextLine();
		System.out.print(" Enter the second string: ");
		String word2 = scanner.nextLine();
		// TODO: Process the strings here (ignore spaces , case)
		word1= word1.toLowerCase();
		word1= word1.trim();
		word2= word2.toLowerCase();
		word2= word2.trim();
		System.out.println("Are they anagrams? " + isAnagram(word1, word2));
		printLetterCounts(word1);
	}

	/**
	 * Returns true if the two strings are anagrams of each other.
	// TODO: implement using countLetters ()
	 */
	public static boolean isAnagram(String a, String b) {
		if (Arrays.equals(countLetters(a), countLetters(b))) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Helper method to count how many times each letter (a-z) appears.
	 * ignores spaces
	// TODO: fill array with letter frequencies
	 */
	public static int[] countLetters(String s) {
//		char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 
//				'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		int[] counts = new int[26];
		Arrays.fill(counts, 0);
		for(int i=0; i<s.length(); i++) {
			if(0 <= (int) s.charAt(i)-97 && (int) s.charAt(i)-97<=26) {
				counts[(int) s.charAt(i)-97]++;
			}
		}
		return counts;
	}

	/**
	 * Print only letters that appear in the string with their counts.
	// TODO: implement nicely formatted output
	 */
	public static void printLetterCounts(String s) {
		System.out.println("Letters and number of those in the word:");
		int[] counts = countLetters(s);
		for(int i=0; i<counts.length; i++) {
			if(counts[i] != 0) {
				System.out.println((char) (i+97)+ ": " + counts[i]);
			}
		}
	}
}
