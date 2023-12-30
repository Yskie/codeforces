import java.io.*;
import java.util.*;

public class p584a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" "); 
        int s1 = Integer.parseInt(s[0]);
        int s2 = Integer.parseInt(s[1]);
        if (s2 == 10) {
            out.println(t * Math.pow(10, s1));
        }
        
        out.flush();
    }
}