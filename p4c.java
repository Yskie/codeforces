import java.io.*;
import java.util.*;

public class p4c {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        HashMap<String, Integer> names = new HashMap<>();
        for (int i = 0; i < l; i++) {
            String name = br.readLine();
            Integer curr = names.get(name);
            if (curr == null) {
                names.put(name, 1);
                out.println("OK");
            } else {
                out.println(name + curr);
                names.replace(name, curr + 1);                
            }
        }
        out.flush();
    }
}