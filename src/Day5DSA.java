import java.util.Scanner;

public class Day5DSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be searched in the array:");
        int key = sc.nextInt();
        linearSearch(arr, key);
    }
    static void linearSearch(int[] num, int key){
        for (int i = 0; i < num.length; i++) {
            if(key== num[i]){
                System.out.println("Found the element at the index : " +  i);
            }
        }
    }
}
