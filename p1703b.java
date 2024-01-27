import java.io.*;
import java.util.*;

public class p1703b {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            int l2 = Integer.parseInt(br.readLine());
            char[] s = br.readLine().toCharArray();
            HashSet<Character> se = new HashSet<>();
            int o = 0;
            for (int j = 0; j < l2; j++) {
                o++;
                se.add(s[j]);
            }
            out.println(o + se.size());
        }
        out.flush();
    }
}
