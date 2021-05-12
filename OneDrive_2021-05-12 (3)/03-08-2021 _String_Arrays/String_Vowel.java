package string;

import java.util.Scanner;

public class String_Vowel {
	 static String  result = "";
	 static void  filterConsonents(String string){	
					
	 }
	 
	 

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" enter any name");
		String string = scanner.next();
		for (int i = 0; i < string.length(); i++) {
			System.out.println(string.charAt(i));
			 char ch = 'a';
			 
				if( ch == 'a' || ch == 'e' ||ch == 'i' || ch == 'o' || ch == 'u' ){ 	
			
			
		}
			filterConsonents(string);	
	        scanner.close();
	}

}
}

