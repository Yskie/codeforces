import java.io.*;
import java.util.*;

public class p520a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        char[] l2 = br.readLine().toLowerCase().toCharArray();
        Character[] data = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < data.length; i++) {
            hs.add(data[i]);
        }

        for (int i = 0; i < l; i++) {
            if (hs.contains(l2[i])) {
                hs.remove(l2[i]);
            }
        }
        out.println(hs.isEmpty() ? "YES" : "NO");
        out.flush();
    }
}