// Array Case 6: Elements Greater than Average
 
// Find the average of the array, and then display all elements that are greater than this average.
 
// Example Input:
// Array = [3, 7, 9, 2, 6]
 
// Step 1: Average = (3+7+9+2+6)/5 = 27/5 = 5.4
// Step 2: Elements greater than 5.4 â†’ 7, 9, 6
 
// Expected Output:
// Average = 5.4
// Elements greater than average = 7 9 6

import java.util.Scanner;

public class GreaterThanAverage {

    public static void greaterThanAverage(int B[]) {

        int sum = 0;

        for(int index = 0; index < B.length; index++) {
            sum += B[index];
        }

        double average = (double) sum / B.length;

        System.out.println("Average = " + average);

        System.out.print("Elements greater than average = ");

        for(int index = 0; index < B.length; index++) {

            if(B[index] > average) {
                System.out.print(B[index] + " ");
            }
        }
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

        greaterThanAverage(A);
    }
}
