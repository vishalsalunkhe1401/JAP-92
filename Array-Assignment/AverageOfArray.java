// Array Case 3: Average of Array Elements
// Find the average value of all elements in an array.
// Example Input:
//  Array = [2, 4, 6, 8, 10]

// Expected Output:
// Average = 6.0

import java.util.Scanner;
public class AverageOfArray{

	public static void averageValue(int B[]){
		int sum=0;
		for(int index=0; index<B.length;index++){
			sum+=B[index];
		}
		double average = (double)sum/B.length;

		System.out.println("Average = " + average);

	}
	  

	  public static void main(String []args){

	  	Scanner scanner=new Scanner(System.in);
	  	System.out.println("Enter Array");
	  	int size = scanner.nextInt();
	  	int A[]= new int[size];

	  	for(int index=0; index<A.length;index++){

	     A[index]=scanner.nextInt();
	  	}
        averageValue(A);
	  }
}