import java.io.*;

public class p1883a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int curr = 1;
        PrintWriter out = new PrintWriter(System.out);

        for (int i = 0; i < l; i++) {
            int count = 0;
            char[] n = br.readLine().toCharArray();
            for (int j = 0; j < n.length; j++) {
                int digit = n[j] - 48;
                if (digit == 0) {
                    digit = 10;
                }
                if (curr == digit) {
                    count++;
                    continue;
                }

                count += Math.abs(curr - digit) + 1;
                curr = digit;
            }
            out.println(count);
            out.flush();
            curr = 1;
        }

    }
}
