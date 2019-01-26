package day_1_core_java;

import java.util.Scanner;

public class Reverse_string {

	public static void main(String args[]) {
		ReverseStringClass reverseStringobj = new ReverseStringClass();
		reverseStringobj.reverseString();
	}
}
class ReverseStringClass{
	void reverseString() {
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string =>" + "  ");
		    String first = sc.nextLine();
		    
		    char[] temp = new char[first.length()];
		    int count = 0;
		    for (int i = first.length() - 1; i >= 0; i--) {
				temp[count++] = first.charAt(i);
			}
		    
		    System.out.println(temp);
		}
		
		
	}
}