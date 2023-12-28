import java.io.*;
import java.util.*;

public class p43a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < l; i++) {
            String s = br.readLine();
            Integer curr = map.get(s);
            if (curr == null) {
                map.put(s, 1);
            } else {
                map.replace(s, curr + 1);
            }
        }


        if (map.size() == 1) {
            for (String i : map.keySet()) {
                System.out.println(i);
            }
            System.exit(0);
        }


        String prev = "";
        int prevNum = -1;
        for (String i : map.keySet()) {
            if (prevNum == -1) {
                prev = i;
                prevNum = map.get(i);
            } else {
                if (prevNum > map.get(i)) {
                    out.println(prev);
                } else {
                    out.println(i);
                }
            }

        }

        out.flush();
    }
}
