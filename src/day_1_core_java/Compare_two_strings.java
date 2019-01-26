package day_1_core_java;

import java.util.Scanner;

public class Compare_two_strings {
	public static void main(String args[]) {
		CompareClass compareObj = new CompareClass();
		compareObj.compare();
		}
}

class CompareClass
{
	void compare() {
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the first string =>" +"  ");
	     String first = sc.nextLine();
	     
	     Scanner sc2 = new Scanner(System.in);
	     System.out.println("Enter the second string =>" +"  ");
	     String second = sc2.nextLine();
	     
	     if (first.toLowerCase().equals(second.toLowerCase())) {
			System.out.println("They are equal");
		}
	     else {
	    	 System.out.println("They are not equal");
	     }
	}
}