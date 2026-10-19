import java.util.Scanner;

public class DigitManipulationMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Positional Search");
            System.out.println("2. Shift (Left to Right)");
            System.out.println("3. Shift (Right to Left)");
            System.out.println("4. Append Logic");
            System.out.println("5. Armstrong Check");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Second Last Digit
                    int secondLast = (num / 10) % 10;

                    // Second Digit from Left
                    int temp = num;
                    int digits = 0;

                    while (temp != 0) {
                        digits++;
                        temp /= 10;
                    }

                    temp = num;
                    for (int i = 1; i < digits - 1; i++) {
                        temp /= 10;
                    }

                    int secondLeft = temp % 10;

                    System.out.println("Second Last Digit = " + secondLast);
                    System.out.println("Second Digit From Left = " + secondLeft);
                    break;

                case 2:
                    // First Digit to End
                    String str1 = String.valueOf(num);
                    String result1 = str1.substring(1) + str1.charAt(0);

                    System.out.println("After Left to Right Shift = " + result1);
                    break;

                case 3:
                    // Last Digit to Front
                    String str2 = String.valueOf(num);
                    String result2 = str2.charAt(str2.length() - 1)
                            + str2.substring(0, str2.length() - 1);

                    System.out.println("After Right to Left Shift = " + result2);
                    break;

                case 4:
                    // Append Logic
                    System.out.print("Enter second number: ");
                    int num2 = sc.nextInt();

                    int temp2 = num2;
                    int count = 0;

                    while (temp2 != 0) {
                        count++;
                        temp2 /= 10;
                    }

                    int appended = num;

                    for (int i = 1; i <= count; i++) {
                        appended *= 10;
                    }

                    appended += num2;

                    System.out.println("Appended Number = " + appended);
                    break;

                case 5:
                    // Armstrong Check
                    int temp3 = num;
                    int digitCount = 0;

                    while (temp3 != 0) {
                        digitCount++;
                        temp3 /= 10;
                    }

                    temp3 = num;
                    int sum = 0;

                    while (temp3 != 0) {
                        int digit = temp3 % 10;
                        sum += Math.pow(digit, digitCount);
                        temp3 /= 10;
                    }

                    if (sum == num)
                        System.out.println(num + " is an Armstrong Number");
                    else
                        System.out.println(num + " is Not an Armstrong Number");

                    break;

                case 6:
                    System.out.println("Program Exited...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}