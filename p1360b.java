import java.io.*;
import java.util.*;

public class p1360b {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            int l1 = Integer.parseInt(br.readLine());
            String[] s = br.readLine().split(" "); 
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int j = 0; j < l1; j++) {
                pq.add(Integer.parseInt(s[j]));
            }

            int diff = 1000000;
            int prev = pq.poll();
            while (!pq.isEmpty()) {
                int curr = pq.poll();
                if (curr - prev < diff) {
                    diff = curr - prev;
                }
                prev = curr;
            }
            out.println(diff);
        }
        out.flush();
    }
}