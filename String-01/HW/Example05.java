 // Write a Java  program to convert lowercase string to uppercase.

public class Example05{

	public static void main(String[]args){

		String name="vishal";

		char arr[]=name.toCharArray();
 
		for(int i=0;i<arr.length;i++){

			if(arr[i]>='a'&&arr[i]<='z'){
				arr[i]=(char)(arr[i]-32);
			}

			}

			for(char n:arr){
				System.out.print(n+"");
			}


	}
	
}