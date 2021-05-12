package string;

import java.util.Scanner;

public class String_Number_Split {


		static String natural(String number) {
            String str="";
            int num=90;
            for(int i=1;i<=num;i++) {
                    str +=i+"\n";
            }
            return str;
        }
        static String number(String numbers) {
            String str1="";
            String str2="90-70,34,1,56-89";
            str2=str2.replaceAll("-", ",");
            str1+=str2;
            return "Given number with "+str1;
        }
        
          public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner sc=new Scanner(System.in);
            System.out.println(natural("number"));
            System.out.println(number("numbers"));
            sc.close();
        }

	}


