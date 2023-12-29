import java.io.*;
import java.util.*;

public class p379a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" "); 
        int s1 = Integer.parseInt(s[0]);
        int s2 = Integer.parseInt(s[1]);   
        int o = 0;
        int r = 0;

        //5 2 should be 9.
        //5
        //2
        //1 + 1
        //1
        while ((s1 + r) >= s2) {
            o += s1;
            if (s1 / s2 == (s1 + r) / s2) {
                //Means same, no need to add r.
                r += s1 % s2;
                s1 = s1 / s2;
            } else {
                int s3 = (s1 + r) / s2;
                r = r - (s3 * s2 - s1);
                s1 = s3;
            }
        }
        System.out.println(o + s1);
        out.flush();
    }
}
