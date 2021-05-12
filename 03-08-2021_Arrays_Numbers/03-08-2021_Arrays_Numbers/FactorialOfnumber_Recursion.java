import java.util.Scanner;
  public class FactorialOfnumber_Recursion
  {
   static int factorialNumber(int number){
	if(number ==1){
		
		return 1;
	
       } 
        else
         {
	             return number * factorialNumber(number-1);
          }
	
}

	
	
	public static void main(String[] args)
	{ 
		System.out.println( factorialNumber(5));
     
	}

}
