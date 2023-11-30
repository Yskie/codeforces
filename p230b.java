import java.io.*;

public class p230b {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < l; i++) {
            long num = Long.parseLong(s[i]);
            if (num <= 3) {
                out.println("NO");
                continue;
            }

            double n = Math.sqrt(num);
            long longn = (long) n;
            if (n != longn) {
                out.println("NO");
                continue;
            }

            if (isPrime(longn)) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }

        out.flush();
    }

    static boolean isPrime(long n) {
        if (n < 2)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        long sqrtN = (long) Math.sqrt(n) + 1;
        for (long i = 6L; i <= sqrtN; i += 6) {
            if (n % (i - 1) == 0 || n % (i + 1) == 0)
                return false;
        }
        return true;
    }
}
