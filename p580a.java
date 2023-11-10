import java.io.*;

public class p580a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        long max = 0;
        long localMax = 0;
        long prev = 0;
        for (int i = 0; i < l; i++) {
            int num = Integer.parseInt(s[i]);
            if (num >= prev) {
                localMax++;
                prev = num;
            } else {
                max = Math.max(max, localMax);
                localMax = 1;
                prev = num;
            }
        }

        if (localMax > max) {
            max = localMax;
        }
        out.println(max);
        out.flush();
    }
}