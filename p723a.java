import java.io.*;
import java.util.*;

public class p723a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" "); 
        int s1 = Integer.parseInt(s[0]);
        int s2 = Integer.parseInt(s[1]);
        int s3 = Integer.parseInt(s[2]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(s1);
        pq.add(s3);
        pq.add(s2);

        int f = pq.poll();
        pq.poll();
        int b = pq.poll();
        int output = 100000;

        for (int i = f; i <= b; i++) {
            int tmp = Math.abs(s1 - i) + Math.abs(s2 - i) + Math.abs(s3 - i);
            if (tmp < output) {
                output = tmp;
            }
        }
        out.println(output);
        out.flush();
    }
}