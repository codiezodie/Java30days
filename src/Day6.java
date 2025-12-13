import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        while (true) {
            System.out.println("\nChoose operation:");
            System.out.println("1. Count vowels");
            System.out.println("2. Convert to uppercase & lowercase");
            System.out.println("3. Compare two strings (ignore case)");
            System.out.println("4. Reverse string");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    int count = 0;
                    for (int i = 0; i < input.length(); i++) {
                        char c = input.charAt(i);
                        if ("aeiouAEIOU".indexOf(c) != -1) count++;
                    }
                    System.out.println("Number of vowels: " + count);
                    break;

                case 2:
                    System.out.println("UPPERCASE: " + input.toUpperCase());
                    System.out.println("lowercase: " + input.toLowerCase());
                    break;

                case 3:
                    System.out.print("Enter another string: ");
                    sc.nextLine();  // Clear buffer
                    String input2 = sc.nextLine();
                    if (input.equalsIgnoreCase(input2)) {
                        System.out.println("Strings are EQUAL");
                    } else {
                        System.out.println("Strings are NOT equal");
                    }
                    break;

                case 4:
                    String rev = "";
                    for (int i = input.length() - 1; i >= 0; i--) {
                        rev += input.charAt(i);
                    }
                    System.out.println("Reversed string: " + rev);
                    break;

                case 5:
                    System.out.println("Exiting... Bye boss 😎👋");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
