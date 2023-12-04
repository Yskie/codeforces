import java.io.*;
import java.util.*;

public class p1154a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" "); 
        int max = 0;
        for (int i = 0; i < 4; i++) {
            if (Integer.parseInt(s[i]) > max) {
                max = Integer.parseInt(s[i]);
            }
        }

        for (int i = 0; i < 4; i++) {
            int diff = max - Integer.parseInt(s[i]);
            if (diff != 0) {
                out.print(diff);
                out.print(" ");
            }
            
        }
        out.flush();
    }
}