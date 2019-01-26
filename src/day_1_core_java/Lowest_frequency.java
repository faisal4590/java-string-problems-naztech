package day_1_core_java;

import java.util.Scanner;

public class Lowest_frequency {
	public static void main(String args[]) {
		LowestFrequency lowestFrequency = new LowestFrequency();
		lowestFrequency.lowestFrequency();
	}
}

class LowestFrequency
{
	void lowestFrequency() {
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

		     //find min freq
		     /* Finds minimum frequency */
		     int min = 0;
		     for(i=0; i<255; i++)
		     {
		         if(arr[i] != 0)
		         {
		             if(arr[min] == 0 || arr[i] < arr[min])
		                 min = i;
		         }
		     }
		     
		     System.out.println("Min frequency word is " + (char)min + " and it was found" +" "+ arr[min] + " times");
		 }
	}
}