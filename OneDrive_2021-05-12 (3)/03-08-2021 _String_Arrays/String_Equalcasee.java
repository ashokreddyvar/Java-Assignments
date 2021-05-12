package string;

public class String_Equalcasee {
	
    static void isEqual(){
    	 String str1 = new String("Ashok");
    		String str2 = new String ("ashok");
    		String  str = "";
    
    	if(str1.equals(str2)){
			str+= " same name";
			
		}
		else 
		{
		str+= " not same";
		}
    	System.out.println(str);
    }
    
    	
	public static void main(String[] args) {
		String str3 = new String("Ashok");
		String str4 = new String ("ashok");
		String  str = "";
		isEqual();
		if(str3.equalsIgnoreCase(str4)){
			str+= " same name";
			
		}
		else 
		{
		str+= " not same";	
		}
		System.out.println(str);
	}

}
