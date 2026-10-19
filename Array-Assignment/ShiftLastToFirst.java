Array Case 8: Shift Last Element to First
WAP to shift last element to first from array.
 Example Input:
input: {10,20,30,40,50}
Output:{50,10,20,30,40}

import java.util.Scanner;

public class ShiftLastToFirst {

    public static void shiftLastToFirst(int B[]) {

        int last = B[B.length - 1];

        for(int index = B.length - 1; index > 0; index--) {
            B[index] = B[index - 1];
        }

        B[0] = last;

        System.out.print("Output: ");

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