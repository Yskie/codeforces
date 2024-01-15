import java.io.*;
import java.util.*;

public class p1426a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            String[] s = br.readLine().split(" ");
            int s1 = Integer.parseInt(s[0]);
            int s2 = Integer.parseInt(s[1]);
            if (s1 <= 2) {
                out.println("1");
                continue;
            }

            s1 -= 2;
            int floor = s1 / s2;
            int r = s1 % s2;

            if (r == 0) {
                out.println(floor + 1);
            } else {
                out.println(floor + 2);
            }


        }
        out.flush();
    }
}