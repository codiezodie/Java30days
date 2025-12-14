
import java.util.HashMap;
import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the word : ");
    String word = sc.nextLine();

        while (true) {
            System.out.println("\nChoose operation:");
            System.out.println("1. Count number of words");
            System.out.println("2. Find the longest word");
            System.out.println("3. Find the shortest word");
            System.out.println("4. Count frequency of each word");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            String[] words = word.split(" ");

            switch (ch) {
                case 1:
                    System.out.println("Number of words in the given string is :" +words.length);
                    break;
                case 2:
                    String longest = words[0];

                    for (int i = 1; i < words.length; i++) {
                        if (words[i].length() > longest.length()) {
                            longest = words[i];
                        }
                    }

                    System.out.println("Longest word: " + longest);
                    break;
                case 3:
                    String shortest = words[0];

                    for (int i = 1; i < words.length; i++) {
                        if (words[i].length() < shortest.length()) {
                            shortest = words[i];
                        }
                    }
                    System.out.println("Shortest word: " + shortest);
                    break;
                case 4:
                    HashMap<String, Integer> mp = new HashMap<>();

                    for (String w : words) {
                        if (!mp.containsKey(w)) {
                            mp.put(w, 1);
                        } else {
                            mp.put(w, mp.get(w) + 1);
                        }
                    }

                    for (String key : mp.keySet()) {
                        System.out.println(key + " = " + mp.get(key));
                    }
                    break;
                case 5:
                    System.out.println("Exiting... Bye boss 😎👋");
                    return;

                default:
                    System.out.println("Invalid choice!");

            }
        }
    }
}
