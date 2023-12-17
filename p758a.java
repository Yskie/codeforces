import java.io.*;
import java.util.*;

public class p758a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" "); 
        int max = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < s.length; i++) {
            pq.add(-Integer.parseInt(s[i]));
        }

        max = -pq.poll();
        int o = 0;
        while (!pq.isEmpty()) {
            o += max + pq.poll();
        }
        out.println(o);
        out.flush();
    }
}