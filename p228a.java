import java.io.*;
import java.util.*;

public class p228a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] l = br.readLine().split(" ");
        HashSet<Integer> set = new HashSet<>();
        int l1 = Integer.parseInt(l[0]);
        int l2 = Integer.parseInt(l[1]);
        int l3 = Integer.parseInt(l[2]);
        int l4 = Integer.parseInt(l[3]);
        set.add(l1);
        set.add(l2);
        set.add(l3);
        set.add(l4);

        out.println(4 - set.size());


        out.flush();
    }   
}