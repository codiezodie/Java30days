import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name boss:");
        String name = sc.next();
        System.out.println("Enter your age boss:");
        int age = sc.nextInt();
        System.out.println("Enter your cgpa boss:");
        float cgpa = sc.nextFloat();
        System.out.println("Do you love coding boss:(true/false):");
        boolean love = sc.nextBoolean();

        System.out.println("Boss name is :"+ name);
        System.out.println("Boss age is :"+ age);
        System.out.println("Boss cgpa is :"+ cgpa);
        System.out.println("Boss loves coding :"+ love);


    }
}
