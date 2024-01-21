import java.io.*;
import java.util.*;

public class p1624a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            int l2 = Integer.parseInt(br.readLine());
            String[] s = br.readLine().split(" "); 
            int[] a = new int[l2];
            int max = 0;
            int min = 1000000010;
            for (int j = 0; j < l2; j++) {
                int n = Integer.parseInt(s[j]);
                a[j] = n;
                if (n > max) {
                    max = n;
                }

                if (n < min) {
                    min = n;
                }
            }

            out.println(max - min);
        }
        out.flush();
    }
}