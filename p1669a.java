import java.io.*;
import java.util.*;

public class p1669a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            int s = Integer.parseInt(br.readLine());
            if (s <= 1399) {
                out.println("Division 4");
            } else if (s <= 1599) {
                out.println("Division 3");
            } else if (s <= 1899) {
                out.println("Division 2");
            } else {
                out.println("Division 1");
            }
        }
        out.flush();
    }
}