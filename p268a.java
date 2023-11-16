import java.io.*;
import java.util.*;

public class p268a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        ArrayList<Pair> pp = new ArrayList<>();
        for (int i = 0; i < l; i++) {
            String[] s = br.readLine().split(" ");
            int s1 = Integer.parseInt(s[0]);
            int s2 = Integer.parseInt(s[1]);
            pp.add(new Pair(s1, s2));
        }

        int count = 0;
        for (int i = 0; i < l; i++) {
            Pair p = pp.get(i);
            for (int j = i + 1; j < l; j++) {
                Pair check = pp.get(j);
                if (p.head == check.tail) {
                    count++;
                } 
                if (p.tail == check.head) {
                    count++;
                }
            }   
        }
        out.println(count);
        out.flush();
    }
}

class Pair {
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

    // lst.sort(Comparator.comparing(Pair::getHead));

}