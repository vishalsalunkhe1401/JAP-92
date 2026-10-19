// Array Case 12: Shift Last to First (Without Third Variable)
 
// Write a program to move the last element of the array to the first position (shift right by one) without using a third variable.

import java.util.Scanner;

public class ShiftLastToFirstWithoutThird {

    public static void shiftLastToFirst(int B[]) {

        System.out.print("Before Shift: ");
        for(int index = 0; index < B.length; index++) {
            System.out.print(B[index] + " ");
        }

        for(int index = B.length - 1; index > 0; index--) {

            B[index] = B[index] + B[index - 1];
            B[index - 1] = B[index] - B[index - 1];
            B[index] = B[index] - B[index - 1];
        }

        System.out.println();

        System.out.print("After Shift: ");
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

        shiftLastToFirst(A);
    }
}Example Input:
Array = [10, 20, 30, 40, 50]
 
Expected Output:
Before Shift: [10, 20, 30, 40, 50]
After Shift:  [50, 10, 20, 30, 40]

import java.util.Scanner;

public class ShiftLastToFirstWithoutThird {

    public static void shiftLastToFirst(int B[]) {

        System.out.print("Before Shift: ");
        for(int index = 0; index < B.length; index++) {
            System.out.print(B[index] + " ");
        }

        for(int index = B.length - 1; index > 0; index--) {

            B[index] = B[index] + B[index - 1];
            B[index - 1] = B[index] - B[index - 1];
            B[index] = B[index] - B[index - 1];
        }

        System.out.println();

        System.out.print("After Shift: ");
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

        shiftLastToFirst(A);
    }
}