import java.util.Scanner;

public class Day7DSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // treat uppercase & lowercase as same
        input = input.toLowerCase();

        boolean[] seen = new boolean[256];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (!seen[c]) {
                seen[c] = true;
                result.append(c);
            }
        }

        System.out.println("String after removing duplicates: " + result);
    }
}

