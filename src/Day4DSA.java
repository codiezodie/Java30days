import java.util.Scanner;

public class Day4DSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int isEven = 0;
        int isOdd = 0;
        for (int j : arr) {

            if (j % 2 == 0) {
                isEven++;
            } else {
                isOdd++;
            }

        }
        System.out.println("Even no of elements in the array :" +isEven);
        System.out.println("Odd no of elements in the array :" +isOdd);
    }
}
