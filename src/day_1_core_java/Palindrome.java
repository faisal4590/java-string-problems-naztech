package day_1_core_java;

import java.util.Scanner;

public class Palindrome {

	public static void main(String args[]) {

		PalindromeClass palindromeObj = new PalindromeClass();
		palindromeObj.palindrome();
		
	}
}

class PalindromeClass{
	void palindrome()
	{
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string =>" + "  ");
		    String first = sc.nextLine();
		    
		    char[] temp = new char[first.length()];
		    int count = 0;
		    for (int i = first.length() - 1; i >= 0; i--) {
				temp[count++] = first.charAt(i);
			}
		    
		   String temp2 = new String(temp);
		   if (first.equals(temp2)) {
			System.out.println("They are palindrome");
		   }
		   else {
			System.out.println("They are not palindrome");
		   }
		}
	}
}