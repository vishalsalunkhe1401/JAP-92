import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = scanner.nextInt();

        int A[] = new int[size];

        for (int index = 0; index < A.length; index++) {
            System.out.print("Enter Num: ");
            A[index] = scanner.nextInt();
        }

        System.out.println("Display Array !!");

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println();
    }
}