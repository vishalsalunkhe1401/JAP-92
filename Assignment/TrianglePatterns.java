import java.util.Scanner;

public class TrianglePatterns {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Right Angle Triangle");
            System.out.println("2. Mirrored Right Triangle");
            System.out.println("3. Inverted Right Triangle");
            System.out.println("4. Inverted Mirrored Triangle");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {

                System.out.print("Enter Rows: ");
                int rows = sc.nextInt();

                System.out.println("1. Solid");
                System.out.println("2. Hollow");
                System.out.print("Enter Pattern Type: ");
                int type = sc.nextInt();

                switch (choice) {

                    // 1. Right Angle Triangle
                    case 1:

                        if (type == 1) { // Solid
                            for (int i = 1; i <= rows; i++) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                        } else { // Hollow
                            for (int i = 1; i <= rows; i++) {
                                for (int j = 1; j <= i; j++) {

                                    if (i == 1 || i == rows || j == 1 || j == i)
                                        System.out.print("*");
                                    else
                                        System.out.print(" ");
                                }
                                System.out.println();
                            }
                        }
                        break;

                    // 2. Mirrored Right Triangle
                    case 2:

                        if (type == 1) { // Solid
                            for (int i = 1; i <= rows; i++) {

                                for (int s = 1; s <= rows - i; s++)
                                    System.out.print(" ");

                                for (int j = 1; j <= i; j++)
                                    System.out.print("*");

                                System.out.println();
                            }
                        } else { // Hollow
                            for (int i = 1; i <= rows; i++) {

                                for (int s = 1; s <= rows - i; s++)
                                    System.out.print(" ");

                                for (int j = 1; j <= i; j++) {

                                    if (i == 1 || i == rows || j == 1 || j == i)
                                        System.out.print("*");
                                    else
                                        System.out.print(" ");
                                }
                                System.out.println();
                            }
                        }
                        break;

                    // 3. Inverted Right Triangle
                    case 3:

                        if (type == 1) { // Solid
                            for (int i = rows; i >= 1; i--) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                        } else { // Hollow
                            for (int i = rows; i >= 1; i--) {
                                for (int j = 1; j <= i; j++) {

                                    if (i == rows || i == 1 || j == 1 || j == i)
                                        System.out.print("*");
                                    else
                                        System.out.print(" ");
                                }
                                System.out.println();
                            }
                        }
                        break;

                    // 4. Inverted Mirrored Triangle
                    case 4:

                        if (type == 1) { // Solid
                            for (int i = rows; i >= 1; i--) {

                                for (int s = 0; s < rows - i; s++)
                                    System.out.print(" ");

                                for (int j = 1; j <= i; j++)
                                    System.out.print("*");

                                System.out.println();
                            }
                        } else { // Hollow
                            for (int i = rows; i >= 1; i--) {

                                for (int s = 0; s < rows - i; s++)
                                    System.out.print(" ");

                                for (int j = 1; j <= i; j++) {

                                    if (i == rows || i == 1 || j == 1 || j == i)
                                        System.out.print("*");
                                    else
                                        System.out.print(" ");
                                }
                                System.out.println();
                            }
                        }
                        break;
                }

            } else if (choice != 5) {
                System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        System.out.println("Program Exited...");
        sc.close();
    }
}