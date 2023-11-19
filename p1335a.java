import java.io.*;

public class p1335a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            int s = Integer.parseInt(br.readLine());
            if (s <= 2) {
                out.println(0);
                continue;
            }

            if (s % 2 == 0)
                s -= 1;
            
            out.println(s / 2);
        }

        out.flush();
    }
}