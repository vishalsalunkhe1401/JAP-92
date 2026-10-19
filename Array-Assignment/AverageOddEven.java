// Array Case 5: Average of Odd and Even Elements
 
// From a given array, separately calculate:
// - Average of odd elements
// - Average of even elements
 
// Example Input:
// Array = [5, 10, 15, 20, 25]
 
// Expected Output:
// Odd elements = 5, 15, 25 â†’ Average = 15.0
// Even elements = 10, 20 â†’ Average = 15.0
 


import java.util.Scanner;

public class AverageOddEven {

    public static void averageOfOddEven(int B[]) {

        int oddSum = 0;
        int oddCount = 0;

        int evenSum = 0;
        int evenCount = 0;

        System.out.print("Odd Elements = ");
        for(int index = 0; index < B.length; index++) {

            if(B[index] % 2 != 0) {
                System.out.print(B[index] + " ");
                oddSum += B[index];
                oddCount++;
            }
        }

        System.out.println();

        System.out.print("Even Elements = ");
        for(int index = 0; index < B.length; index++) {

            if(B[index] % 2 == 0) {
                System.out.print(B[index] + " ");
                evenSum += B[index];
                evenCount++;
            }
        }

        System.out.println();

        double oddAverage = (double) oddSum / oddCount;
        double evenAverage = (double) evenSum / evenCount;

        System.out.println("Odd Average = " + oddAverage);
        System.out.println("Even Average = " + evenAverage);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = scanner.nextInt();

        int A[] = new int[size];

        System.out.println("Enter Elements:");

        for(int index = 0; index < A.length; index++) {
            A[index] = scanner.nextInt();
        }

        averageOfOddEven(A);
    }
}