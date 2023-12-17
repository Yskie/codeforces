import java.io.*;
import java.util.*;

public class p32b {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] c = br.readLine().toCharArray();
        boolean flag = false;
        
        for (int i = 0; i < c.length; i++) {
            char curr = c[i];
            if (flag) {
                if (curr == '.') {
                    out.print(1);
                } else {
                    out.print(2);
                }

                flag = false;
            } else {
                if (curr == '.') {
                    out.print(0);
                } else {
                    flag = true;
                }
            }
        }
        out.flush();
    }
}