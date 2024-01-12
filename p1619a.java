import java.io.*;
import java.util.*;

public class p1619a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            char[] c = br.readLine().toCharArray();
            if (c.length % 2 != 0) {
                out.println("NO");
                continue;
            }
            boolean flag = false;
            int mid = c.length / 2;
            for (int j = 0; j < mid; j++) {
                char f = c[j];
                char s = c[j + mid];
                if (f != s) {
                    flag = true;
                    break;
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