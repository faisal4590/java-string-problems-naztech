package day_1_core_java;

import java.util.Scanner;

public class Last_occurance {
	public static void main(String args[]) {
		LastOccuranceClass lastOccuranceObj = new LastOccuranceClass();
		lastOccuranceObj.lastOccurance();
	}
}

class LastOccuranceClass{
	void lastOccurance() {
		
		while(true)
		{
			Scanner sc = new Scanner(System.in);
		     System.out.println("Enter the string =>" +"  ");
		     String first = sc.nextLine();
		     
		     Scanner sc2 = new Scanner(System.in);
		     System.out.println("Enter the character to find =>" +"  ");
		     String second = sc2.nextLine();
		     
		     int count=0, occurance = 0;
		     
		     for (int i = 0; i < first.length(); i++) {
		    	char singleChar  = first.charAt(i);
		    	char singleChar2 = second.charAt(0);
		    	
				if (singleChar2 == singleChar) {
					count++;
					occurance = i;
				}
			}
		     if (count==0) {
		    	 System.out.println("The character you are looking for is not in the string.");
					
			}
		     else {
		    	 System.out.println("Last occurance of the character is found at " + (occurance+1));
		     }
		}
		
		
	}
}