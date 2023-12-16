import java.io.*;
import java.util.*;

public class p472a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int mid = l / 2;
        for (int i = 4; i <= mid; i++) {
            if(isPrime(i)) {
                continue;
            }
            int left = l - i;
            if (isPrime(left)) {
                continue;
            }
            out.print(i);
            out.print(" ");
            out.print(left);
            break;
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
