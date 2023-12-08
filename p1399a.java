import java.io.*;
import java.util.*;

public class p1399a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            int num = Integer.parseInt(br.readLine());
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < num; j++) {
                pq.add(Integer.parseInt(s[j]));
            }
            boolean flag = false;
            int prev = pq.poll();
            while (!pq.isEmpty()) {
                int curr = pq.poll();
                if (Math.abs(prev - curr) > 1) {
                    flag = true;
                    break;
                }

                prev = curr;
            }

            if (flag) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

        out.flush();
    }
}