import java.io.*;
import java.util.*;

public class p1535a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            String[] s = br.readLine().split(" ");
            int s1 = Integer.parseInt(s[0]);
            int s2 = Integer.parseInt(s[1]);
            int s3 = Integer.parseInt(s[2]);
            int s4 = Integer.parseInt(s[3]);
            int max1 = Math.max(s1, s2);
            int min1 = Math.min(s1, s2);
            int max2 = Math.max(s3, s4);
            int min2 = Math.min(s3, s4);

            if (max2 > min1 && max1 > min2) {
                out.println("YES");
            } else {
                out.println("NO");
            }
            

        }
        out.flush();
    }
}