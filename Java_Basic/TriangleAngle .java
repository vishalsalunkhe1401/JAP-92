//Write a  program to enter two angles of a triangle and find the third angle.

import java.util.Scanner;

public class TriangleAngle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first angle: ");
        int angle1 = sc.nextInt();

        System.out.print("Enter second angle: ");
        int angle2 = sc.nextInt();

        int thirdAngle = 180 - (angle1 + angle2);

        System.out.println("Third Angle = " + thirdAngle);

        sc.close();
    }
}