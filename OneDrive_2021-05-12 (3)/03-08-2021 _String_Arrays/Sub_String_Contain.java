package string;

public class Sub_String_Contain {
	static void subStringContains()
	{
		String[] words = {"South Africa", "Afghanistan", "Sri Lanka", 
				          "New Zealand", "West Indies", "England", "India",
				            "Australia", "Pakistan", "Bangladesh"};
		for (int i = 0; i < words.length; i++) {
			if( words[i].contains("an")){
				System.out.println(words[i]);
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {   
		subStringContains();
	}

}
