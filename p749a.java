import java.io.*;
import java.util.*;

public class p749a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int count = 0;
        String s = "";
        if (l % 2 != 0) {
            count++;
            l -= 3;
            s += "3 ";
        }

        int mid = l / 2;
        for (int i = 0; i < mid; i++) {
            count++;
            s += "2 "  ;      
        }
        
        out.println(count);
        out.println(s);
        out.flush();
    }
}