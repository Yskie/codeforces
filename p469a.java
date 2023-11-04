import java.io.*;
import java.util.*;

public class p469a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String[] s1 = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < s1.length; i++) {
            set.add(Integer.parseInt(s1[i]));
        }
        for (int i = 0; i < s2.length; i++) {
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