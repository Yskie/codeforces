import java.io.*;
import java.util.*;

public class p9a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int s1 = Integer.parseInt(s[0]);
        int s2 = Integer.parseInt(s[1]);
        int max = Math.max(s1, s2);
        if (max == 1) {
            out.println("1/1");
        }
        if (max == 2) {
            out.println("5/6");
        }
        if (max == 3) {
            out.println("2/3");
        }
        if (max == 4) {
            out.println("1/2");
        }
        if (max == 5) {
            out.println("1/3");
        }
        if (max == 6) {
            out.println("1/6");
        }
        out.flush();
    }
}
