import java.io.*;
import java.util.*;

public class p432a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" "); 
        int s1 = Integer.parseInt(s[0]);
        int s2 = Integer.parseInt(s[1]);  
        String[] p = br.readLine().split(" "); 
        int o = 0;
        for (int i = 0; i < s1; i++) {
            int diff = 5 - Integer.parseInt(p[i]);
            if (diff >= s2) {
                o++;
            }
        }
        out.println(o / 3);
        out.flush();
    }
}