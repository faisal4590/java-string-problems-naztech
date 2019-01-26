package day_1_core_java;

import java.util.Scanner;

public class Find_all_occurance {
	public static void main(String args[]) {
		FindAllOccurance findAllOccuranceObj = new FindAllOccurance();
		findAllOccuranceObj.findAllOccurance();
	}
}

class FindAllOccurance{
	void findAllOccurance() {
		
		 while(true) {
			 Scanner sc = new Scanner(System.in);
		     System.out.println("Enter the string =>" +"  ");
		     String first = sc.nextLine();
		     
		     Scanner sc2 = new Scanner(System.in);
		     System.out.println("Enter the character to find =>" +"  ");
		     String second = sc2.nextLine();
		    
		     int count=0;
		     
		     for (int i = 0; i < first.length(); i++) {
		    	char singleChar  = first.charAt(i);
		    	char singleChar2 = second.charAt(0);
		    	
				if (singleChar2 == singleChar) {
					System.out.println(singleChar2+ " is found at "+ (i+1) + "th position");
					count++;
				}
			}
		     if (count==0) {
				System.out.println("Character not found in the string");
			}
		 }
		 
	}
}