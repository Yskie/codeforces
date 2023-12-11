import java.io.*;
import java.util.*;

public class p466a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int s1 = Integer.parseInt(s[0]);
        int s2 = Integer.parseInt(s[1]);
        int s3 = Integer.parseInt(s[2]);
        int s4 = Integer.parseInt(s[3]);

        // Might use special ticket. -- Calculate both scenario, return min.
        // Ticket
        int outcome1 = s1 * s3;
        int outcome2 = 0;

        if (s1 <= s2) {
            // Only special.
            outcome2 = s4;
        } else {
            // Special + extra
            int outcome = (s1 / s2) * s4 + (s1 % s2) * s3;
            int toutcome = (s1 / s2) * s4 + s4;
            outcome2 = Math.min(outcome, toutcome);
        }

        out.println(Math.min(outcome1, outcome2));
        out.flush();
    }
}
