import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1872c {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());

        for (int i = 0; i < l; i++) {
            int results1 = -1;
            int results2 = -1;
            String[] s = br.readLine().split(" ");
            int s1 = Integer.parseInt(s[0]);
            int s2 = Integer.parseInt(s[1]);

            for (int j = s1; j <= s2; j++) {
                int check = minDivisor(j);
                if (check != j) {
                    results1 = check;
                    results2 = j - check;
                    break;
                }
            }

            if (results1 == -1) {
                System.out.println(-1);
            } else {
                System.out.println(String.valueOf(results1) + " " + String.valueOf(results2));
            }

        }

    }

    static int minDivisor(int num) {
        for (int i = 2; i < Math.round(Math.pow(num, 0.5)) + 1; i++) {
            if (num % i == 0) {
                return i;
            }
        }
        return num;
    }
}
