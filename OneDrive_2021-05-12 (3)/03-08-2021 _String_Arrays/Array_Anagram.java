package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Anagram {

	public static void main(String[] args) {
	 String str  = "";
	Scanner scannner = new Scanner (System.in);
    System.out.println(" enter  First word for anagram checking");
    String string = scannner.next();
    System.out.println(" enter  second word for anagram checking");
    String string2 = scannner.next();
    string = string.trim().toLowerCase();
    string2 = string2.trim().toLowerCase();
    char[] ch = string.toCharArray();
    char[] ch1 = string2.toCharArray();
    Arrays.sort(ch);
    Arrays.sort(ch1);
   String fisrt =  new String(ch);
    String second = new String(ch1);
    
    if(fisrt.equals(second))
    {
    	System.out.println(" Anagram");
    	
    }
    else {
    
    	System.out.println( " Not Anagram");
    	
    }
   
    
	}
	

}
