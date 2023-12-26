import java.io.*;
import java.util.*;

public class p579a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int o = 0;
        while (l != 0) {
            int curr = 1;
            boolean flag = false;
            while (curr <= l) {
                flag = true;
                curr = curr << 1;
            }
            if (flag) {
                curr = curr >> 1;
            }
            o++;
            l -= curr;
        }
        out.println(o);
        out.flush();
    }
}