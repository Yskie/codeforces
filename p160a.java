import java.io.*;
import java.util.*;

public class p160a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int total = 0;
        int output = 0;
        String[] s = br.readLine().split(" ");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < l; i++) {
            int val = Integer.parseInt(s[i]);
            pq.add(-val);
            total += val;
        }

        double split = total / 2;
        
        while (split >= 0) {
            int curr = -pq.poll();
            split -= curr;
            output++;
        }

        out.println(output);
        out.flush();
        
    }
}