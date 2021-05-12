package string;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Array_Sumof_Even_Number {
	static  int sum = 0;
	 static int getSumOfEvenNumbers(int[] input){
		 for (int i = 0; i < input.length; i++) {
			 if(input[i]%2 == 0){
			    sum +=input[i];
			 }
			
		}
		return sum;
		 
	 }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" enter array size ");
		int size = scanner.nextInt();
		System.out.println(" Enter the array values ");
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
		array[i] = scanner.nextInt();
		}
		System.out.println(getSumOfEvenNumbers(array));
		scanner.close();
		
		
		
		
		
	}

}
