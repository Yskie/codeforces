import java.io.*;

public class p318a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] l = br.readLine().split(" ");
        long l1 = Long.parseLong(l[0]);
        long l2 = Long.parseLong(l[1]);

        long mid;

        if (l1 % 2 == 0) {
            mid = l1 / 2;
        } else {
            mid = l1 / 2 + 1;
        }

        if (l2 > mid) {
            //Even
            long neww = l2 - mid;
            out.println(neww * 2);
        } else {
            out.println(l2 * 2 - 1);
        }

        out.flush();

    }
}