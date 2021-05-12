package string;

public class String_Palindrome {

	public static void main(String[] args) {
		String name  = "cococ";
		String str = "";
		for (int i = name.length()-1; i >=0; i--) {
			 str += name.charAt(i);
		}
			if(str.equals(name)){
				 str= " palindrome";
			}// if
			else {
				str = " not Palindrome";
			}// else
		System.out.print(str);
} // main
	
}// class

