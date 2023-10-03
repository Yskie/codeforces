import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p50a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int m = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);
        if (m % 2 == 0 || n % 2 == 0) {
            System.out.println(n * m / 2);
        } else {
            int dom = (m - 1) * (n - 1) / 2;
            dom += (n - 1) / 2 + (m - 1) / 2;
            System.out.println(dom);
        }

    }
}