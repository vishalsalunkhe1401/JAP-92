// Array Case 7: Shift First Element to Last
 
// WAP to shift first element to last from array
 
// Example Input:
// input: {10,20,30,40,50}
// output:{20,30,40,50,10}
 
import java.util.Scanner;

public class ShiftFirstToLast {

    public static void shiftFirstToLast(int B[]) {

        int first = B[0];

        for(int index = 0; index < B.length - 1; index++) {
            B[index] = B[index + 1];
        }

        B[B.length - 1] = first;

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

        shiftFirstToLast(A);
    }
}