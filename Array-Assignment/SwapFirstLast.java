
//  Array Case 9: Swap First and Last Element
// Write a program to swap the first element and the last element of an array.
//  Example Input:
// Array = [10, 20, 30, 40, 50]
// Expected Output:
// Before Swap: [10, 20, 30, 40, 50]
// After Swap:  [50, 20, 30, 40, 10]

import java.util.Scanner;

public class SwapFirstLast {

    public static void swapFirstLast(int B[]) {

        System.out.print("Before Swap: ");
        for(int index = 0; index < B.length; index++) {
            System.out.print(B[index] + " ");
        }

        int temp = B[0];
        B[0] = B[B.length - 1];
        B[B.length - 1] = temp;

        System.out.println();

        System.out.print("After Swap: ");
        for(int index = 0; index < B.length; index++) {
            System.out.print(B[index] + " ");
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

        swapFirstLast(A);
    }
}