import java.io.*;

public class p1850a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            String[] s = br.readLine().split(" ");
            int s1 = Integer.parseInt(s[0]);
            int s2 = Integer.parseInt(s[1]);
            int s3 = Integer.parseInt(s[2]);

            if (s1 + s2 >= 10 || s2 + s3 >= 10 || s1 + s3 >= 10) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
        out.flush();
    }
}
