import java.io.*;
import java.util.*;

public class p1409a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            String[] s = br.readLine().split(" ");
            int s1 = Integer.parseInt(s[0]);
            int s2 = Integer.parseInt(s[1]);
            int max;
            int min;

            if (s1 < s2) {
                min = s1;
                max = s2;
            } else {
                min = s2;
                max = s1;
            }

            int moves = 0;
            int diff = max - min;
            
            moves += diff / 10;
            if (diff - (diff / 10) * 10 != 0) {
                moves++;
            }

            out.println(moves);

        }
        out.flush();
    }
}