package Arrays;

import java.util.Scanner;

public class Arrays_reverse_order{
	
	
	static int[] reverse ( int [] array)
	{ 
		int res[] = new int[array.length];
		System.out.println("reverse order is....");
		int k = 0;
	     for ( int index = array.length-1 ; index >=0 ; index-- )
	     {
	     
	     res[k++] = array[index];
	     }
	return res;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner ( System.in);
		System.out.println("enter size of an array");
	     int size = scn.nextInt();
	     System.out.println("enter "+size+" "+"elements");
	     int [] array = new int [size];
	     for ( int index = 0 ; index <array.length ; index++ )
	     {
	    	 array[index] = scn.nextInt();
	     }
	     for (int x :reverse(array) )
	  
	    System.out.println(x);
	     
	    }
}

	     