import java.io.*;
import java.util.*;

public class p1791a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String[] cf = {"c", "o", "d", "e", "f", "r", "e", "s"};

        for (int i = 0; i < l; i++) {
            String s = br.readLine();
            boolean f = false;
            for (int j = 0; j < cf.length; j++) {
                if (s.equals(cf[j])) {
                    f = true;
                    break;
                }
            }
            if (f) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
        out.flush();
    }
}
