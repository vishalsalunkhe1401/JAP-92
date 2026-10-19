 Write a  program to enter marks of five subjects and calculate total, average and percentage.
import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        double sub1 = sc.nextDouble();

        System.out.print("Enter marks of Subject 2: ");
        double sub2 = sc.nextDouble();

        System.out.print("Enter marks of Subject 3: ");
        double sub3 = sc.nextDouble();

        System.out.print("Enter marks of Subject 4: ");
        double sub4 = sc.nextDouble();

        System.out.print("Enter marks of Subject 5: ");
        double sub5 = sc.nextDouble();

        double total = sub1 + sub2 + sub3 + sub4 + sub5;
        double average = total / 5;
        double percentage = (total / 500) * 100;

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
        System.out.println("Percentage = " + percentage + "%");

        sc.close();
    }
}