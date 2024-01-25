import java.io.*;

public class p703a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int m = 0;
        int c = 0;
        for (int i = 0; i < l; i++) {
            String[] s = br.readLine().split(" ");
            int s1 = Integer.parseInt(s[0]);
            int s2 = Integer.parseInt(s[1]);
            if (s2 > s1) {
                c++;
            }
            if (s2 < s1) {
                m++;
            }
        }

        if (m > c) {
            out.println("Mishka");
        } else if (m < c) {
            out.println("Chris");
        } else {
            out.println("Friendship is magic!^^");

        }
        out.flush();
    }
}
