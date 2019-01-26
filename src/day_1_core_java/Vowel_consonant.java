package day_1_core_java;

import java.util.Scanner;

public class Vowel_consonant {
	public static void main(String args[]) {
		VowelConsonantClass vowelConsonantobj = new VowelConsonantClass();
		vowelConsonantobj.countVowelConsonant();
	}
}

class VowelConsonantClass{
	void countVowelConsonant() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string =>" + "  ");
	    String first = sc.nextLine();
	    int vowelCount = 0, consonantCount = 0;
	    
	    for (int i = 0; i < first.length(); i++) {
	    	char singleChar = first.charAt(i);
	    	if (singleChar == 'a' || singleChar == 'e' || singleChar == 'i'
	    			|| singleChar == 'o' || singleChar == 'u') {
				vowelCount++;
			}
	    	else {
				consonantCount++;
			}
		}
	    
	    System.out.println("Number of vowels: " + vowelCount + "\n" 
	    	+ "Number of consonants " + consonantCount);
	}
}
