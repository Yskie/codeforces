import java.io.*;
import java.util.*;
 
public class p706b {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        TreeMap<Integer, Integer> tMap = new TreeMap<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < l; i++) {
            int num = Integer.parseInt(s[i]);
            pq.add(num);
            tMap.put(num, num);
        }
 
        int count = 0;
        while (!pq.isEmpty()) {
            count++;
            int curr = pq.poll();
            if (map.get(curr) == null) {
                map.put(curr, count);
            } else {
                map.replace(curr, count);
            }
        }
 
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int q = Integer.parseInt(br.readLine());
            if (tMap.containsKey(q)) {
                out.println(map.get(q));
                continue;
            }
            Integer tmp = tMap.higherKey(q);
            Integer tmpl = tMap.lowerKey(q);
            if (tmp == null) {
                out.println(l);
                continue;
            }

            if (tmpl == null) {
                out.println(0);
                continue;
            }
            out.println(map.get(tmpl));
        }
        out.flush();
    }
}