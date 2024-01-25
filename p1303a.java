import java.io.*;
import java.util.*;

public class p1303a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            char[] s = br.readLine().toCharArray();
            int ii = -1;
            for (int j = 0; j < s.length; j++) {
                if (s[j] == '1') ii = j;
            }

            int o = 0;
            boolean flag = false;
            for (int j = 0; j <= ii; j++) {
                if (!flag && s[j] == '1') {
                    flag = true;
                } else if (flag && s[j] == '0') o++;

            }            
            out.println(o);

        }
        out.flush();
    }
}