import java.io.*;
import java.util.*;

public class p1433a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            char[] c = br.readLine().toCharArray();

            // Get first digit.
            int o = (c[0] - 48 - 1) * 10;
            for (int j = 1; j <= c.length; j++) {
                o += j;
            }
            out.println(o);
            
        }
        out.flush();
    }
}