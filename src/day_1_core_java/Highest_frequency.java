package day_1_core_java;

import java.util.Scanner;



public class Highest_frequency {
	public static void main(String args[]) {
		MaximumOccuringChar maximumOccuringChar = new MaximumOccuringChar();
		maximumOccuringChar.max();
	}
}

class MaximumOccuringChar{
	void max() {
		while(true) {
			 Scanner sc = new Scanner(System.in);
		     System.out.println("Enter the string =>" +"  ");
		     String first = sc.nextLine();
		    
		     int count=0,p=0,ascii;
		     
		     int[] arr = new int[255];
		     
		     int i=0;
		     //find the frequency of each char
		     while(p <first.length())
		     {
		         ascii = (int)first.charAt(i);
		         arr[ascii] += 1;
		         i++;
		         p++;
		     }

		     //find max freq
		     int max = 0;
		     for(i=0; i<255; i++)
		     {
		         if(arr[i] > arr[max])
		             max = i;
		     }
		     
		     System.out.println("Maxed frequency word is " + (char)max + " and it was found" +" "+ arr[max] + " times");
		 }
	}
}