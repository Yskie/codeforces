import java.io.*;
import java.util.*;

public class p581a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" "); 
        int s1 = Integer.parseInt(s[0]);
        int s2 = Integer.parseInt(s[1]);    

        int min = Math.min(s1, s2);
        out.print(min);
        out.print(" ");
        if (s1 - min >= 2) {
            out.print((s1 - min) / 2);
        } else if (s2 - min >= 2) {
            out.print((s2 - min) / 2);
        } else {
            out.print(0);
        }

        
        out.flush();
    }
}