package Arrays;

public class Factorial {
	static int noofDigitInNumber(int number){
		int count = 0;
		while(number > 0){
			count++;
			number = number/10;
		}
		return count++;
	}

	public static void main(String[] args) {
	 System.out.println(noofDigitInNumber(1534));

	}

}
