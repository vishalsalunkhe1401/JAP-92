// Array Case 11: Shift First to Last (Without Third Variable)
 
// Write a program to move the first element of the array to the last position (shift left by one) without using a third variable.
 
// Example Input:
// Array = [1, 2, 3, 4, 5]
 
// Expected Output:
// Before Shift: [1, 2, 3, 4, 5]
// After Shift:  [2, 3, 4, 5, 1]
 
import java.util.Scanner;

public class ShiftFirstToLastWithoutThird {

    public static void shiftFirstToLast(int B[]) {

        System.out.print("Before Shift: ");
        for(int index = 0; index < B.length; index++) {
            System.out.print(B[index] + " ");
        }

        for(int index = 0; index < B.length - 1; index++) {

            B[index] = B[index] + B[index + 1];
            B[index + 1] = B[index] - B[index + 1];
            B[index] = B[index] - B[index + 1];
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

        shiftFirstToLast(A);
    }
}