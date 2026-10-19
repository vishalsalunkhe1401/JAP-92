import java.util.Scanner;

public class PatternMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Hollow Square");
            System.out.println("2. Solid Rhombus");
            System.out.println("3. Mirrored Rhombus");
            System.out.println("4. Hollow Solid Rhombus");
            System.out.println("5. Hollow Mirrored Rhombus");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 5) {
                System.out.print("Enter N: ");
                int n = sc.nextInt();

                switch (choice) {

                    case 1: // Hollow Square
                        for (int i = 1; i <= n; i++) {
                            for (int j = 1; j <= n; j++) {

                                if (i == 1 || i == n || j == 1 || j == n)
                                    System.out.print("*");
                                else
                                    System.out.print(" ");
                            }
                            System.out.println();
                        }
                        break;

                    case 2: // Solid Rhombus
                        for (int i = 1; i <= n; i++) {

                            for (int s = 1; s <= n - i; s++)
                                System.out.print(" ");

                            for (int j = 1; j <= n; j++)
                                System.out.print("*");

                            System.out.println();
                        }
                        break;

                    case 3: // Mirrored Rhombus
                        for (int i = 1; i <= n; i++) {

                            for (int s = 1; s < i; s++)
                                System.out.print(" ");

                            for (int j = 1; j <= n; j++)
                                System.out.print("*");

                            System.out.println();
                        }
                        break;

                    case 4: // Hollow Solid Rhombus
                        for (int i = 1; i <= n; i++) {

                            for (int s = 1; s <= n - i; s++)
                                System.out.print(" ");

                            for (int j = 1; j <= n; j++) {

                                if (i == 1 || i == n || j == 1 || j == n)
                                    System.out.print("*");
                                else
                                    System.out.print(" ");
                            }
                            System.out.println();
                        }
                        break;

                    case 5: // Hollow Mirrored Rhombus
                        for (int i = 1; i <= n; i++) {

                            for (int s = 1; s < i; s++)
                                System.out.print(" ");

                            for (int j = 1; j <= n; j++) {

                                if (i == 1 || i == n || j == 1 || j == n)
                                    System.out.print("*");
                                else
                                    System.out.print(" ");
                            }
                            System.out.println();
                        }
                        break;
                }
            } else if (choice != 6) {
                System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        System.out.println("Program Exited...");
        sc.close();
    }
}