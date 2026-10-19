//  Array Case 10: Swap First and Last Element (Without Third Variable)
//  Write a program to swap the first element and the last element of an array without using a third (temporary) variable.
//  Example Input:
// Array = [7, 14, 21, 28, 35]
//  Expected Output:
// Before Swap: [7, 14, 21, 28, 35]
// After Swap:  [35, 14, 21, 28, 7]
// import java.util.Scanner;

public class SwapWithoutThirdVariable {

    public static void swapFirstLast(int B[]) {

        System.out.print("Before Swap: ");
        for(int index = 0; index < B.length; index++) {
            System.out.print(B[index] + " ");
        }

        B[0] = B[0] + B[B.length - 1];
        B[B.length - 1] = B[0] - B[B.length - 1];
        B[0] = B[0] - B[B.length - 1];

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