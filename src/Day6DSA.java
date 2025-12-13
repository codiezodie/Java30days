import java.util.HashMap;
import java.util.Scanner;

public class Day6DSA {
    public static void main(String[] args) {
        HashMap<Character,Integer> mp = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word :");
        String input = sc.next();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(!mp.containsKey(c)){
                mp.put(c,1);
            }else{
                mp.put(c, mp.get(c)+1);
            }
        }
        for (char key: mp.keySet()){
            System.out.println(key + " = " + mp.get(key));
        }
    }
}
