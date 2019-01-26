package day_1_core_java;

import java.util.Scanner;

public class Length_of_string {
	
	public static int len(String ab){
        char[] inputString = ab.toCharArray();
        int count = 0;

        try{
            for(int i=0;inputString[i]!='\0';i++)
                count++;
        }
        catch(Exception e){
        }
        return count;
    }
	
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string =>" +"  ");
        String ab = sc.nextLine();
        System.out.println("\nString Length is:" + len(ab));
    }

    
}
