import java.io.*;
import java.util.*;

public class p584a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" "); 
        int s1 = Integer.parseInt(s[0]);
        int s2 = Integer.parseInt(s[1]);
        if (s2 == 10) {
            if (s1 == 1) {
                out.println(-1);
            } else {
                out.println((int) Math.pow(10, s1 - 1));
            }
        } else {
            out.println(s2 * (int) Math.pow(10, s1 - 1));
        }
        
        out.flush();
    }
}