//Write a Java  program to copy one string to another string.  

public class Example02{
	public static void main(String[]args){

		String name = "Dreamer";

		char arr[] = name.toCharArray();

		char arr1[]=new char[arr.length];

		for(int i=0;i<arr1.length;i++){

			 arr1[i]=arr[i];

			
		}

	for(int i=0;i<arr1.length;i++){

		System.out.print(arr1[i]+"");
	}

	}
}