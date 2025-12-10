import java.util.Scanner;

public class Day3_i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum =0;
        int i=0;
        //using while loop
        while( i<=n){
            sum += i;
            i++;
        }

        //using for-loop
        for ( i = 1; i <=n ; i++) {
         sum +=i;
        }
        System.out.println("Sum of " + n+ " numbers is: "+ sum);
    }
}
