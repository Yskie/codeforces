import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class p118a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = br.readLine().toLowerCase().toCharArray();
        ArrayList<Character> a = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            char word = s[i];
            if (word != 'a' && word != 'e' && word != 'i' && word != 'o' && word != 'u') {
                a.add(word);
            }
        }
        
        PrintWriter out = new PrintWriter(System.out);
        for (int i = 0; i < a.size(); i++) {
            out.print(".");    
            out.print(a.get(i));
        }
        out.flush();
    }
}