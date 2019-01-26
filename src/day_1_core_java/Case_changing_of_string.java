package day_1_core_java;

import java.util.Scanner;

public class Case_changing_of_string {
	public static void main(String args[]) {
		CaseChangeClass caseChangeObj = new CaseChangeClass();
		caseChangeObj.caseChange();
	}
}

class CaseChangeClass
{
	void caseChange() {
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the string in lowercase =>" +"  ");
	     String first = sc.nextLine();
	     
	     for (int i = 0; i< first.length(); i++)
	        {
	            char singleChar = first.charAt(i);
	            if (singleChar>='A' && singleChar<='Z') {
	            	singleChar = (char)( (singleChar + 32) ); 
		            System.out.print(singleChar);
				}
	            else {
	            	singleChar = (char)( (singleChar - 32) ); 
		            System.out.print(singleChar);
				}
	         }
	}
}