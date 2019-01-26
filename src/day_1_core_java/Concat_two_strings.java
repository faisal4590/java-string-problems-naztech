package day_1_core_java;

import java.util.Scanner;

public class Concat_two_strings {
	public static void main(String args[]) {
		ConcatClass concatObj = new ConcatClass();
		concatObj.concat_func();
	}
}

class ConcatClass{
	public void concat_func() {
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the first string =>" +"  ");
	     String first = sc.nextLine();
	     
	     Scanner sc2 = new Scanner(System.in);
	     System.out.println("Enter the second string =>" +"  ");
	     String second = sc2.nextLine();
	     
	     System.out.println(first + " " + second);
	}
}