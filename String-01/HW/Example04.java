 // Write a Java  program to compare two strings
public class Example04{

	 public static void main(String[] args) {

	 	String name="Vishal";
	 	String name1="Vishal";

	 	char arr[]=name.toCharArray();
	 	char arr1[]=name1.toCharArray();

	 	boolean ans= true;

	 	for(int i=0;i<arr.length;i++){
	 		if(arr[i]!=arr1[i])
	 			ans = false;

	 	}

	 	if(ans){
	 		System.out.println("Both are same");

	 	}
	 	else{
	 			System.out.println("not same");


	 	}



		
	}
	
}