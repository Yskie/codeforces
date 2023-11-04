import java.io.*;
import java.util.*;

public class p469a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());

        String s = br.readLine();
        String[] s1;
        String[] s2;
        if (s.length() == 0) {
            s1 = new String[0];
        } else {
            s1 = s.split(" ");
        }

        s = br.readLine();
        if (s.length() == 0) {
            s2 = new String[0];
        } else {
            s2 = s.split(" ");
        }
                        
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i < s1.length; i++) {
            set.add(Integer.parseInt(s1[i]));
        }
        for (int i = 1; i < s2.length; i++) {
            set.add(Integer.parseInt(s2[i]));
        }

        for (int i = 1; i <= l; i++) {
            if (!set.contains(i)) {
                System.out.println("Oh, my keyboard!");
                System.exit(0);
            }
        }

        out.println("I become the guy.");
        out.flush();
    }
}