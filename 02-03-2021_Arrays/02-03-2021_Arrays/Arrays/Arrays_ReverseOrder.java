package Arrays;
import  java.util.Scanner;
public class Arrays_ReverseOrder {
	static String res ="";
	static String array_reverse(int  startvalue ,int endvalue){
		
		for(int i=endvalue; i<=startvalue; i++){
			res+= endvalue;
		}
		return res.substring(0,res.length()-1);
	}
	public static void main(String[] args) {
		
	  Scanner sc = new Scanner(System.in);
	  res+=" Enter   satrtvalue  ";
      res+= " Enter   endvalue ";
	  int startvalue = sc.nextInt();
	  int endvalue = sc.nextInt();
	  int array[] = new int[10];
	  System.out.println(res);
	  System.out.println(array_reverse(startvalue,endvalue));
		sc.close();
		
		

	}

}
