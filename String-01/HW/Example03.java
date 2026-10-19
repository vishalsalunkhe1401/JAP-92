//Write a Java  program to concatenate two strings.


public class Example03{
	
	public static void main(String[]args){

		String name="Vishal";
		String name1="Dreamer";

		char arr[]=name.toCharArray();
		char arr1[]=name1.toCharArray();


       char arr2[]=new char[arr.length+arr1.length];
       int k =0;

       for(int i=0;i<arr.length;i++){
       	arr2[k++]=arr[i];
       }

         for(int i=0;i<arr1.length;i++){
       	arr2[k++]=arr1[i];
       }


   System.out.print(arr2);
	}
}