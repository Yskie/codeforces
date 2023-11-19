import java.io.*;
import java.util.*;

public class p141a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> map = new HashMap<>();
        char[] name1 = br.readLine().toCharArray();
        char[] name2 = br.readLine().toCharArray();
        char[] name3 = br.readLine().toCharArray();

        for (int i = 0; i < name1.length; i++) {
            char c = name1[i];
            if (map.get(c) == null) {
                map.put(c, 1);
            } else {
                map.replace(c, map.get(c) + 1);
            }
        }

        for (int i = 0; i < name2.length; i++) {
            char c = name2[i];
            if (map.get(c) == null) {
                map.put(c, 1);
            } else {
                map.replace(c, map.get(c) + 1);
            }
        }        

        for (int i = 0; i < name3.length; i++) {
            char c = name3[i];
            Integer count = map.get(c);
            if (count == null) {
                System.out.println("NO");
                System.exit(0);
            } else {
                if (count == 1) {
                    map.remove(c);
                } else {
                    map.replace(c, count - 1);
                }
            }
        }
        if (map.isEmpty()) {
            out.println("YES");
        } else {
            out.println("NO");
        }

        out.flush();
    }

}