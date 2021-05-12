import java.util.Scanner;

public class Array_SmallestEelement {

	
		
		
		
		
		 static int SmallestOfElement(int number[])
		 {
			int small = number[0];
			 for (int i = 0; i < number.length; i++) {
				 if(number[i]<small){
					 small = number[i]; 
					
				 } 
				
			}
			 return small;
		 }

		public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
			 System.out.println("  enter number are");
			int array[] = new int[7]; 
			for (int i = 0; i < array.length; i++)
			{	
			array[i] = sc.nextInt();
				
			}	
			System.out.println(" the Smallestest number is :"+SmallestOfElement(array));
			sc.close();


	}
	
	
}
