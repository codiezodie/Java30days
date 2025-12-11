import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two digit a & b value:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result1 = sum(a,b);
        System.out.println("Sum of "+ a + " and " + b +" is:" + result1);

        System.out.print("Enter the three digit x , y & z value:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int result2 = findmax(x,y,z);
        System.out.println("greatest number in " + x +" " + y + " " + z + " is:" + result2);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        boolean result3 = isEven(n);
        System.out.println("Entered number is even or not?: " + result3);

    }

    static int sum(int a , int b){
        return a+b;
    }

    static int findmax(int x, int y, int z){
        int max = x;

        if(y > max){
            max = y;
        }
        if(z > max){
            max = z;
        }

        return max;
    }

    static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }
        return false;
    }
}
