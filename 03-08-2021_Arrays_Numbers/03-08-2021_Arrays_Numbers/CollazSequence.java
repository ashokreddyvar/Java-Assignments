import java.util.Scanner;

public class CollazSequence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter number ");
        int number = sc.nextInt();
        String res = " "+number+" ";
        
		while(number>1){
			if(number%2 ==0)
			{
				number=number/2;
			}
			else{
				number = (number*3)+1;
				
			}
			res+= number+",";
			
		}
		System.out.println(res.substring(0,res.length()-1));

	}

}
