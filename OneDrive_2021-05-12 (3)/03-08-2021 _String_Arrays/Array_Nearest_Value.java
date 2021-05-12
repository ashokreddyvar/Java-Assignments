package string;

import java.util.Arrays;
import java.util.Scanner;

import Arrays.Array_sorting;

public class Array_Nearest_Value {
	static  int getNearestMinValue(int[] array){
		
			Arrays.sort(array);
			return array[0] - 1;
				
			}
	public static void main(String[] args) {
		String str = "";
		System.out.println(" enter the array size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println( " enter array numbers ");
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println(getNearestMinValue(array));
       System.out.println(str);
       sc.close();
	}

}

