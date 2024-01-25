import java.io.*;
import java.util.*;

public class p1294a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            String[] s = br.readLine().split(" "); 
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);   
            int c = Integer.parseInt(s[2]);   
            int n = Integer.parseInt(s[3]);   
            int max = Math.max(a, Math.max(c, b));
            
            int m = 3 * max - a - b -c;
            n -= m;
            if (n < 0) {
                out.println("NO");
                continue;
            }

            if (n % 3 == 0) {
                out.println("YES");
            } else {
                out.println("NO");
            }

            
        }
        out.flush();
    }
}
