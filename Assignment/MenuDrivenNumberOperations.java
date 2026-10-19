import java.util.Scanner;

public class MenuDrivenNumberOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Digit Stats");
            System.out.println("2. Boundary Sum");
            System.out.println("3. Digit Arithmetic");
            System.out.println("4. Mirror Check");
            System.out.println("5. Math Facts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Count digits
                    int temp1 = num;
                    int count = 0;

                    if (temp1 == 0)
                        count = 1;
                    else {
                        while (temp1 != 0) {
                            count++;
                            temp1 /= 10;
                        }
                    }

                    System.out.println("Total Digits = " + count);
                    break;

                case 2:
                    // Sum of first and last digit
                    int temp2 = num;
                    int lastDigit = temp2 % 10;

                    while (temp2 >= 10) {
                        temp2 /= 10;
                    }

                    int firstDigit = temp2;
                    System.out.println("Boundary Sum = " + (firstDigit + lastDigit));
                    break;

                case 3:
                    // Sum and Product of digits
                    int temp3 = num;
                    int sum = 0, product = 1;

                    while (temp3 != 0) {
                        int digit = temp3 % 10;
                        sum += digit;
                        product *= digit;
                        temp3 /= 10;
                    }

                    System.out.println("Sum of Digits = " + sum);
                    System.out.println("Product of Digits = " + product);
                    break;

                case 4:
                    // Reverse and Palindrome check
                    int temp4 = num;
                    int reverse = 0;

                    while (temp4 != 0) {
                        reverse = reverse * 10 + temp4 % 10;
                        temp4 /= 10;
                    }

                    System.out.println("Reversed Number = " + reverse);

                    if (reverse == num)
                        System.out.println("Palindrome Number");
                    else
                        System.out.println("Not a Palindrome Number");
                    break;

                case 5:
                    // Factorial and Factors
                    long factorial = 1;

                    for (int i = 1; i <= num; i++) {
                        factorial *= i;
                    }

                    System.out.println("Factorial = " + factorial);

                    System.out.print("Factors: ");
                    for (int i = 1; i <= num; i++) {
                        if (num % i == 0)
                            System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 6:
                    System.out.println("Program Exited.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}