import java.io.*;
import java.util.*;

public class p1883c {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        PrintWriter out = new PrintWriter(System.out);
        for (int i = 0; i < l; i++) {
            String[] s = br.readLine().split(" ");
            int divBy = Integer.parseInt(s[1]);
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            boolean printed = false;
            String[] nums = br.readLine().split(" ");
            for (int j = 0; j < nums.length; j++) {
                int num = Integer.parseInt(nums[j]);
                int remainder = num % divBy;
                if (remainder == 0) {
                    out.println(0);
                    out.flush();
                    printed = true;
                    break;
                }
                pq.add(divBy - remainder);
            }

            if (!printed) {
                if (divBy == 2) {
                    out.println(1);
                } else if (divBy == 4) {
                    int smallest = pq.peek();
                    int count2 = 0;
                    Iterator<Integer> iter = pq.iterator();
                    while (iter.hasNext()) {
                        int current = iter.next();
                        if (current == 2) {
                            count2++;
                        }
                    }
                    if (count2 >= 2) {
                        out.println(0);
                    } else if (smallest == 3) {
                        out.println(2);
                    } else {
                        out.println(1);
                    }
                } else {
                    out.println(pq.peek());
                }
                out.flush();

            }
        }

    }
}