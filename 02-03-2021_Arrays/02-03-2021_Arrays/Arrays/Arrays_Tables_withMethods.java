package Arrays;

public class Arrays_Tables_withMethods {
	
	 static String res = "";
	 static String displayTable(int number){
		
		 for(int i= 1; i<=10; i++){
			 {
				 res+= number+" X "+i+" = "+(number*i)+"\n";
			     res+="\n";
			 }
			 return res; 
	 }
     static String rangeOftable(int startValue, int endvalue){
    	 for(int i =startValue; i<=endvalue; i++){
    		 res+= displayTable(number);
    		 res+="\n";
    		 res+=".........\n";
    	 }
    	 return res ;
     }
	public static void main(String[] args) {
		int res =rangeOftable(2,4);
		System.out.println(res);
		
	}
		
		
	
	
}
