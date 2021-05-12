import java.util.Scanner;


public class Array_BiggestofElement {
	 static int BiggestOfElement(int number[])
	 {
		int big = number[0];
		 for (int i = 0; i < number.length; i++) {
			 if(number[i]>big){
				 big = number[i]; 
				
			 } 
			
		}
		 return big;
	 }

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("  enter number are");
		int array[] = new int[7]; 
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			
		}	System.out.println(" the Biggest number is :"+BiggestOfElement(array));
		sc.close();

	}
}
