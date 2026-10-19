import java.util.Scanner;

public class Example02 {

    public static void inputData(int B[]) {
        Scanner scanner = new Scanner(System.in);

        for (int index = 0; index < B.length; index++) {
            System.out.println("Enter num");
            B[index] = scanner.nextInt();
        }
    }

    public static void displayData(int B[]) {

        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Size");
        int size = scanner.nextInt();

        int A[] = new int[size];

        inputData(A);

        System.out.println("Display Data");
        displayData(A);   
    }
}