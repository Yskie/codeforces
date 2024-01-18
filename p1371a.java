import java.io.*;
import java.util.*;

public class p1371a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            int s = Integer.parseInt(br.readLine());
            if (s % 2 == 0) {
                out.println(s / 2);
            } else {
                out.println(s / 2 + 1);
            }
        }
        out.flush();
    }
}