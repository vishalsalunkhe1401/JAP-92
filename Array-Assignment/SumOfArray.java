// Array Case 2: Sum of Array Elements
// Find the sum of all elements in an array.
// Example Input:
// Array = [5, 8, 12, 6]
// Expected Output:
// Sum = 31

import java.util.Scanner;

public class SumOfArray{

	public static void sumOfArray(int B[]){
		int sum=0;

		for( int index=0; index<B.length;index++){
			sum = sum + B[index];
			System.out.println("Sum : "+ sum);
		}
		System.out.println(sum);
	}
	

public static void main (String []args){

	Scanner scanner =new Scanner(System.in);

	System.out.println("Enter Number");

	int size = scanner.nextInt();

	int A[] = new int[size];

	for(int index=0; index<A.length;index++){

	   A[index]=scanner.nextInt();
	}
	sumOfArray(A);

}
}