import java.io.*;
import java.util.*;

public class p479a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int l2 = Integer.parseInt(br.readLine());
        int l3 = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int sum = l * l2 * l3;
        int sum2 = l + l2 + l3;
        int sum3 = (l + l2) * l3;
        int sum4 = l * (l2 + l3);
        int sum5 = l * l2 + l3;
        int sum6 = l + l2 * l3;

        pq.add(-sum);
        pq.add(-sum2);
        pq.add(-sum3);
        pq.add(-sum4);
        pq.add(-sum5);
        pq.add(-sum6);

        out.println(-pq.poll());
        out.flush();
    }   
}