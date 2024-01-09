import java.io.*;
import java.util.*;

public class p1520a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l1 = Integer.parseInt(br.readLine());
        for (int i = 0; i < l1; i++) {
            HashSet<Character> se = new HashSet<>();
            int l = Integer.parseInt(br.readLine());
            char[] s = br.readLine().toCharArray();
            char prev = s[0];
            se.add(prev);
            boolean flag = false;
            for (int j = 1; j < l; j++) {
                if (prev == s[j]) {
                    continue;
                } else {
                    if (se.contains(s[j])) {
                        flag = true;
                        break;
                    } else {
                        prev = s[j];
                        se.add(s[j]);
                    }
                }
            }

            if (flag) {
                out.println("NO");
            } else {
                out.println("YES");
            }

        }
        out.flush();
    }
}