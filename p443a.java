import java.io.*;
import java.util.*;

public class p443a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = br.readLine().toCharArray();
        HashSet<Character> sett = new HashSet<>();
        for (int i = 0; i < s.length; i++) {
            char c = s[i];
            if (c == '{' || c == ' ' || c == ',' || c == '}') {}
            else {
                sett.add(c);
            }
        }
        out.println(sett.size());
        out.flush();
    }   
}