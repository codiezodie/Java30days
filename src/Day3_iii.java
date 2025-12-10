import java.util.Scanner;

public class Day3_iii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = n;

        for (int i = 1; i <= 10; i++) {
            System.out.println(+n + "x"+i+ "=" + sum);
            sum += n;
        }
    }
}
