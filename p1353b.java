import java.io.*;
import java.util.*;

public class p1353b {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            String[] s = br.readLine().split(" "); 
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            
            String[] s1 = br.readLine().split(" ");
            String[] s2 = br.readLine().split(" ");
            int[] i1 = new int[n];
            int[] i2 = new int[n];
            int c1 = 0;
            for (int j = 0; j < n; j++) {
                int num = Integer.parseInt(s1[j]);
                i1[j] = num;
                c1 += num;
            }

            for (int j = 0; j < n; j++) {
                int num = Integer.parseInt(s2[j]);
                i2[j] = num;
            }            
            Arrays.sort(i1);
            Arrays.sort(i2);

            //all add to i1;

            for (int j = 0; j < k; j++) {
                int small = i1[j];
                int largest = i2[n - j - 1];
                if (small >= largest) {
                    break;
                } else {
                    c1 -= small;
                    c1 += largest;
                }
            }
            out.println(c1);
        }
        out.flush();
    }
}