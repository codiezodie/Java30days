import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        //using while loop
        int i = 1;
        while(i<=n){
            System.out.println(i);
            i++;
        }

        //using for loop
        for(i = 1; i<= n; i++){
            System.out.print(i + " ");
        }
    }
}
