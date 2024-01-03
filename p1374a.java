import java.io.*;
import java.util.*;

public class p1374a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            String[] s = br.readLine().split(" ");
            int s1 = Integer.parseInt(s[0]);
            int s2 = Integer.parseInt(s[1]);
            int s3 = Integer.parseInt(s[2]);
            for (int j = s3 - s2; j >= 0; j--) {
                if (j % s1 == 0) {
                    out.println(s2 + j);
                    break;
                }
            }
        }
        out.flush();
    }
}