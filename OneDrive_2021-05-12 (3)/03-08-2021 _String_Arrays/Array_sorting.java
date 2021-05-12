package Arrays;

public class Array_sorting {

	public static void main(String[] args) {
	int[] array = {2,45,43,8,21};
	int temp = 0;
	
	for (int i = 0; i < array.length; i++) {
		for (int j = i+1; j < array.length; j++) {
			if(array[i]>array[j]){
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
			
			}
		
	}
	for (int i : array) {
		System.out.println(i );
	}
  
	}

}
