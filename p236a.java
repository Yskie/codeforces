import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class p236a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] word = br.readLine().toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length; i++) {
                map.put(word[i], 1);
        }  
        if (map.size() % 2 == 0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");

    }
}