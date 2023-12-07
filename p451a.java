import java.io.*;
import java.util.*;

public class p451a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" "); 
        int s1 = Integer.parseInt(s[0]);
        int s2 = Integer.parseInt(s[1]);
        int min = Math.min(s1, s2);

        if (min % 2 == 0) {
            out.println("Malvika");
        } else {
            out.println("Akshat");
        }
        
        out.flush();
    }
}