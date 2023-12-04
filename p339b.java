import java.io.*;
import java.util.*;

public class p339b {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" "); 
        int s1 = Integer.parseInt(s[0]);
        int s2 = Integer.parseInt(s[1]);

        String[] h = br.readLine().split(" ");
        int curr = 1;
        long output = 0;
        for (int i = 0; i < s2; i++) {
            int task = Integer.parseInt(h[i]);

            if (task == curr) {
                continue;
            }

            if (task > curr) {
                int diff = task - curr;
                output += diff;
                curr = task;
                continue;
            }


            if (task < curr) {
                int diff = s1 - curr + task;
                output += diff;
                curr = task;
                continue;
            }            
        }
        out.println(output);
        out.flush();
    }
}