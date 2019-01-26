package day_1_core_java;

import java.util.Scanner;

public class Count_number_of_words {
	public static void main(String args[]) {
		CountWordClass countWordObj = new CountWordClass();
		countWordObj.countWords();
	}
}

class CountWordClass{
	void countWords()
	{
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string =>" + "  ");
		    String first = sc.nextLine();
		    int count = 0;
		    
		    for (int i = 0; i < first.length(); i++) {
		    	char singleChar = first.charAt(i);
		    	if (singleChar == ' ') {
					count++;
				}
		    	if (i == first.length() - 1) {
					// Ami string er ekdom last e chole asci
		    		count++;
				}
			}
		    
		    System.out.println("Total number of words in the string: " + count);
		}
		
		
	}
}