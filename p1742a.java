import java.io.*;
import java.util.*;

public class p1742a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            String[] s = br.readLine().split(" ");
            int s1 = Integer.parseInt(s[0]);
            int s2 = Integer.parseInt(s[1]);
            int s3 = Integer.parseInt(s[2]);
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            pq.add(s1);
            pq.add(s2);
            pq.add(s3);

            int sum = pq.poll() + pq.poll();

            if (sum == pq.poll()) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }

        out.flush();
    }
}