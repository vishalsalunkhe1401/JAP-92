// Array Case 4: Sum of Odd Elements 
// From a given array, calculate the sum of all odd elements only.

// Example Input:
// Array = [11, 22, 33, 44, 55]
 
// Expected Output:
// Odd elements = 11, 33, 55
// Sum = 99
import java.util.Scanner;
public class SumOfOdd{

	public static void sumOfOddElement(int B[]){
		int sum=0;
		for(int index=0; index<B.length;index++){
			if(B[index]%2 !=0){
				sum = sum + B[index];
				System.out.println("----------------------------");
				System.out.println("odd no" + B[index]);

			}
			
		}
		System.out.println();
		System.out.println("Sum of odd Element = "+sum);

}
	public static void main(String[]args){

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Array Size");
		int size=scanner.nextInt();
		int A[]=new int[size];

		for(int index=0; index<A.length;index++){

			A[index]=scanner.nextInt();
		}
          sumOfOddElement(A);

		
	}
	
}