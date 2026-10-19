	      //  Write a  program to enter length in centimetres and convert it into meter and kilometer.
import java.util.Scanner;

public class Killometer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length in centimeters: ");
        double cm = sc.nextDouble();

        double meter = cm / 100;
        double kilometer = cm / 100000;

        System.out.println("Meters     : " + meter);
        System.out.println("Kilometers : " + kilometer);

        sc.close();
    }
}