import java.io.*;
import java.util.*;

public class p230a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int s1 = Integer.parseInt(s[0]);
        int s2 = Integer.parseInt(s[1]);

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0; i < s2; i++) {
            String[] t = br.readLine().split(" ");
            int t1 = Integer.parseInt(t[0]);
            int t2 = Integer.parseInt(t[1]);
            pq.add(new Pair(t1, t2));
        }

        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            if (s1 <= p.head) {
                System.out.println("NO");
                System.exit(0);
            }
            s1 += p.tail;
        }

        out.println("YES");
        out.flush();
    }
}

class Pair implements Comparable<Pair> {
    Integer head;
    Integer tail;

    public Pair(int head, int tail) {
        this.head = head;
        this.tail = tail;
    }

    public int getHead() {
        return this.head;
    }

    public int getTail() {
        return this.tail;
    }

    @Override
    public String toString() {
        return head.toString() + " " + tail.toString();
    }

    @Override
    public int compareTo(Pair o) {
        if (this.head < o.head) {
            return -1;
        } else {
            return 1;
        }
    }

    // lst.sort(Comparator.comparing(Pair::getHead));

}