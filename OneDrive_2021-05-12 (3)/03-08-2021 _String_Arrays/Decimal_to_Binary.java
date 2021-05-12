package Arrays;

import java.util.Scanner;

public class Decimal_to_Binary {
	static String str ="";
	int rem = 0 ;
	int number;
	static void decimalNumber(int number){
		while(number != 0)
		{  
			 int rem = number % 2;
			  number = number/2;     
				 str+= rem ;
		}
		 
		for(int i = str.length()-1; i >= 0; i--){
	
		System.out.print(str.charAt(i));
		}
		
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter any Number for Decimal format");
		int number = sc.nextInt();
		decimalNumber(number);
		sc.close();
		
		
		
		
		

	}

}
