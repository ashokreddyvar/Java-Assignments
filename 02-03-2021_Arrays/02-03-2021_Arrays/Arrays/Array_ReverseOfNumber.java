package Arrays;

public class Array_ReverseOfNumber {
	static String reverseOfNumber(int number){
	int rem = 0,rev = 0;
	while(number>0){
		rem = number % 10;
		rev = (rev * 10) + rem;
		number = number/10;
		
	}
	      return " reverse of given number "+rev;
	}
	public static void main(String[] args) {
		System.out.println( reverseOfNumber(153));
	}
	

}
