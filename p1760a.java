import java.io.*;

public class p1760a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            String[] s = br.readLine().split(" ");
            int s1 = Integer.parseInt(s[0]);
            int s2 = Integer.parseInt(s[1]);
            int s3 = Integer.parseInt(s[2]);
            int max = 0;
            int min = 0;
            if (s1 > s2) {
                max = s1;
                min = s2;
            } else {
                max = s2;
                min = s1;
            }

            if (s3 > max) {
                out.println(max);
            } else if (s3 < min) {
                out.println(min);
            } else {
                out.println(s3);
            }


        }
        out.flush();
    }
}