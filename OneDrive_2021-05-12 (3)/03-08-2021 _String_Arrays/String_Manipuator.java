package string;

import java.util.Scanner;

public class String_Manipuator {
	static String str = "";
	static  void removeVowels(String input) {
		char[] ch = input.toUpperCase().toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char ch1 = ' ';
			ch1 = ch[i];
			if(ch1   == 'A' || ch1 == 'E' ||  ch1 == 'i' || ch1 == 'O'|| ch1 =='U'){
				//str+="";
			}
			else
			{
				str+=ch1 ;
			}
			
		} 
		System.out.println(str);
		
	}

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println(" ente any word ");
	String word = scanner.nextLine();
	if(word.equals(null))
	{
		System.out.println(" null");
	}
	else {
		
	}
	removeVowels(word);
	scanner.close();
	}

}
