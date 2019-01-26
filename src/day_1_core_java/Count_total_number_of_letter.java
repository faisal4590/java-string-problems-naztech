package day_1_core_java;

import java.util.Scanner;

public class Count_total_number_of_letter {
	public static void main(String args[]) {
		countLetterClass countLetterObj = new countLetterClass();
		countLetterObj.count();
	}
}

class countLetterClass{
	void count() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string =>" + "  ");
	    String first = sc.nextLine();
	    int countLetter = 0, countNumber = 0, countSpecialChar = 0;
	    for (int i = 0; i< first.length(); i++)
	    {
	    	char singleChar = first.charAt(i);
	    	if ((singleChar >='a' && singleChar <='z') || (singleChar >='A' && singleChar <='Z')) {
	    		countLetter++;
			}
	    	else if(singleChar>= '0' && singleChar <='9'){
	    		countNumber++;
	    	}
	    	else {
	    		countSpecialChar++;
			}
	    }
	    System.out.println("Total number of alphabets are " + countLetter
	    		+ "\n" + "Total number of digits are " + countNumber
	    		+ "\n" + "Total number of special characters are " + countSpecialChar);
	}
}