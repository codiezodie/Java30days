import java.util.Scanner;

public class Day3DSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Print numbers from 1 to N");
        System.out.println("2. Print sum of first N numbers");
        System.out.println("3. Print multiplication table of a number");
        System.out.println("4. Print pattern (triangle of stars)");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter N: ");
                int n1 = sc.nextInt();
                // example using while loop
                int i = 1;
                System.out.println("Numbers from 1 to " + n1 + ":");
                while (i <= n1) {
                    System.out.println(i);
                    i++;
                }
                break;

            case 2:
                System.out.print("Enter N: ");
                int n2 = sc.nextInt();
                // sum using for loop (single loop only)
                int sum = 0;
                for (int j = 1; j <= n2; j++) {
                    sum += j;
                }
                System.out.println("Sum of first " + n2 + " numbers is: " + sum);
                break;

            case 3:
                System.out.print("Enter the number for table: ");
                int num = sc.nextInt();
                System.out.println("Multiplication table of " + num + ":");
                for (int k = 1; k <= 10; k++) {
                    System.out.println(num + " x " + k + " = " + (num * k));
                }
                break;

            case 4:
                System.out.print("Enter n (number of rows for pattern): ");
                int rows = sc.nextInt();
                System.out.println("Pattern:");
                for (int r = 1; r <= rows; r++) {
                    for (int c = 1; c <= r; c++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid choice. Please run again and choose 1-4.");
        }

        sc.close();
    }
}
