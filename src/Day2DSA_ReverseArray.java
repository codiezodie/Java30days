import java.util.Scanner;

public class Day2DSA_ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int num = sc.nextInt();

        int[] arr = new int[num];
        System.out.println("Enter array elements:");

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        // Reverse logic
        int start = 0;
        int end = num - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("Reversed array:");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
