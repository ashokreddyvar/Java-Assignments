package string;

import java.util.Scanner;

public class Character_Counter {
	
	 static int implement_method (String input, char toFind){
			int count = 0;
			for (int i = 0; i < input.length(); i++) {
				if(toFind == input.charAt(i)) {
					count++;
				}
			}
				if(count > 0) {
					return count;
				}		
			
			return -1;
	 }

	public static void main(String[] args) {
		Scanner scanner = new  Scanner(System.in);
		System.out.println("Enter");
		String input = scanner.nextLine();
		System.out.println("Enter alphabet");
		char toFind = scanner.next().charAt(0);
		
		 System.out.println(implement_method(input,toFind));
		 scanner.close();
	}

}
