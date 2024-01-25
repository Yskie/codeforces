import java.io.*;

public class p1676a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            char[] c = br.readLine().toCharArray();
            int a = c[0] + c[1] + c[2];
            int b = c[3] + c[4] + c[5];
            if (a == b) out.println("YES");
            else out.println("NO");
        }
        out.flush();
    }
}