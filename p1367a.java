import java.io.*;
import java.util.*;

public class p1367a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            char[] c = br.readLine().toCharArray();
            out.print(c[0]);
            for (int j = 1; j < c.length; j += 2) {                
                out.print(c[j]);
            }
            out.println();
        }
        out.flush();
    }
}
