import java.io.*;
import java.util.*;

public class p1703a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            String s = br.readLine().toLowerCase();
            if (s.equals("yes")) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
        out.flush();
    }
}