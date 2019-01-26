package day_1_core_java;

import java.util.Scanner;

public class Reverse_word {
	public static void main(String args[]) {
		ReverseWordClass reverseWordObj = new ReverseWordClass();
		reverseWordObj.reverseWord();
	}
}

class ReverseWordClass{
	void reverseWord() {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string =>" + "  ");
		    String first = sc.nextLine();
		    
		    char[] str;
		    
		    int len, i, index, wordStart, wordEnd;
		    
		    str = first.toCharArray();
		    len   = str.length;
		    char[] reverse = new char[len];
		    index = 0;

		    // Start checking of words from the end of string
		    wordStart = len - 1;
		    wordEnd   = len - 1;

		    while(wordStart > 0)
		    {
		        // If a word is found
		        if(str[wordStart] == ' ')
		        {
		            // Add the word to the reverse string
		            i = wordStart + 1;
		            while(i <= wordEnd)
		            {
		                reverse[index] = str[i];

		                i++;
		                index++;
		            }
		            reverse[index++] = ' ';

		            wordEnd = wordStart - 1;
		        }

		        wordStart--;
		    }

		    // Finally add the last word
		    for(i=0; i<=wordEnd; i++)
		    {
		        reverse[index] = str[i];
		        index++;
		    }
		    String reverseString = new String(reverse);
		    System.out.println("Reverse word of string: " + reverseString);
		}
	}
	
}