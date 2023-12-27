import java.io.*;
import java.util.*;

public class p313a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int l = Integer.parseInt(s);
        if (l > -10) {
            System.out.println(l);
            System.exit(0);
        }
        
        int first = l / 10;
        int rem = l % 10;
        int second = l / 100 * 10 + rem;

        if (first > second) out.println(first);
        else out.println(second);

        out.flush();
    }
}