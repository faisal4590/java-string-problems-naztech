package day_1_core_java;

import java.util.Scanner;

public class Copy_one_string_to_another {

	public static String copy(String ab){
        char[] inputString = ab.toCharArray();
        
        String str2 = new String(inputString);
        char[] outputString = str2.toCharArray();
       
        int i=0;
        try{
            for(i=0;inputString[i]!='\0';i++)
                outputString[i] = inputString[i];
        }
        catch(Exception e){
        }
        String copiedString = new String(outputString);
        return copiedString;
    }
	
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to copy =>" +"  ");
        String inputString = sc.nextLine();
        
        System.out.println("\n After copying, the string is:" + copy(inputString));
    }

}
