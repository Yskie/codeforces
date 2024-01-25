import java.io.*;

public class p1283a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            String[] s = br.readLine().split(" ");
            int s1 = Integer.parseInt(s[0]);
            int s2 = Integer.parseInt(s[1]);
            int org = 60 - s2;
            org += (24 - s1 - 1) * 60;
            out.println(org);
        }
    }
}