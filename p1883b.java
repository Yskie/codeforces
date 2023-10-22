import java.io.*;
import java.util.HashMap;

public class p1883b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        PrintWriter out = new PrintWriter(System.out);

        for (int i = 0; i < l; i++) {
            String[] s = br.readLine().split(" ");
            int len = Integer.parseInt(s[0]);
            int quota = Integer.parseInt(s[1]) + 1;
            char[] word = br.readLine().toCharArray();

            HashMap<Character, Integer> map = new HashMap<>();
            String output = "YES";

            for (int j = 0; j < len; j++) {
                // Add all into a hashmap
                char key = word[j];
                if (map.containsKey(key)) {
                    map.replace(key, map.get(key) + 1);
                } else {
                    map.put(key, 1);
                }
            }
            for (int in : map.values()) {
                if (in % 2 != 0) {
                    quota--;
                    if (quota < 0) {
                        output = "NO";
                        break;
                    }
                }

            }
            out.println(output);
            out.flush();
        }

    }
}
