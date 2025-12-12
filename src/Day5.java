import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        while (true) {   // menu repeats forever
            System.out.println("\nMenu:");
            System.out.println("1. Print array");
            System.out.println("2. Find maximum");
            System.out.println("3. Find minimum");
            System.out.println("4. Search element");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Array elements:");
                    for (int num : arr) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    int max = arr[0];
                    for (int i = 1; i < arr.length; i++) {
                        if (arr[i] > max) max = arr[i];
                    }
                    System.out.println("Maximum element: " + max);
                    break;

                case 3:
                    int min = arr[0];
                    for (int i = 1; i < arr.length; i++) {
                        if (arr[i] < min) min = arr[i];
                    }
                    System.out.println("Minimum element: " + min);
                    break;

                case 4:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] == key) {
                            System.out.println("Found at index: " + i);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Element not present!");
                    break;

                case 5:
                    System.out.println("Exiting... Bye boss 😎👋");
                    return; // stops the program

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
