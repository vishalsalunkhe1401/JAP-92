
		       // Write a  program to calculate the area of an equilateral triangle.
import java.util.Scanner;

public class EquilateralTriangleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of triangle: ");
        double side = sc.nextDouble();

        double area = (Math.sqrt(3) / 4) * side * side;

        System.out.println("Area of Equilateral Triangle = " + area);

        sc.close();
    }
}