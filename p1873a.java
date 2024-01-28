import java.io.*;

public class p1873a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            String s = br.readLine();
            if (s.equals("bca") || s.equals("cab")) {
                out.println("NO");
            } else {
                out.println("YES");
            }
        }
        out.flush();
    }
}