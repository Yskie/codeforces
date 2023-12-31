import java.io.*;
import java.util.*;

public class p1913b {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            char[] c = br.readLine().toCharArray();
            HashMap<Integer, Character> map = new HashMap<>();
            PriorityQueue<Integer> pq0 = new PriorityQueue<>();
            PriorityQueue<Integer> pq1 = new PriorityQueue<>();
            int c0 = 0;
            int c1 = 0;
            for (int j = 0; j < c.length; j++) {
                map.put(j, c[j]);
                if (c[j] == '1') {
                    pq1.add(j);
                    c1++;
                } else {
                    pq0.add(j);
                    c0++;
                }
            }

            if (c0 == c1) {
                out.println(0);
                continue;
            }
            int cost = 0;
            int currInd = 0;
            for (int j = 0; j < c.length; j++) {
                char cc = c[currInd];
                char w = map.get(j);

                //Scenario 1: Alr different.
                if (cc != w) {
                    if (w == '1') {
                        pq1.poll();
                    } else {
                        pq0.poll();
                    }
                    currInd++;
                    continue;
                }

                //Scenario 2: Need to Swap
                if (cc == '1') {
                    if (pq0.isEmpty()) {
                        //If pq0 is empty -- Means that cannot swap anymore.
                        cost = c.length - j;
                        break;
                    } else {
                        //Remove the curr Ind.
                        pq1.poll();
                        int ind = pq0.poll();
                        pq1.add(ind);
                        currInd++;
                    }
                }


                if (cc == '0') {
                    if (pq1.isEmpty()) {
                        //If pq1 is empty -- Means that cannot swap anymore.
                        cost = c.length - j;
                        break;
                    } else {
                        //Remove the curr Ind.
                        pq0.poll();
                        int ind = pq1.poll();
                        pq0.add(ind);                        
                        currInd++;
                    }
                }                



            }
            out.println(cost);
        }

        out.flush();
    }
}