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

            if (s2 <= 3) {

            } else if (s1 % 2 == 0 && s1 != 2) {
                results1 = 2;
                results2 = s1 - 2;
            } else if (s2 % 2 == 0 && s2 != 2) {
                results1 = 2;
                results2 = s2 - 2;
            } else {
                for (int j = s1; j <= s2; j++) {
                    int check = isPrime(j);
                    if (check != -1) {
                        results1 = check;
                        results2 = j - check;
                        break;
                    }
                }
            }

            if (results1 == -1) {
                System.out.println(-1);
            } else {
                System.out.println(String.valueOf(results1) + " " + String.valueOf(results2));
            }

        }

    }

    static int isPrime(int num) {
        if (num == 1) {
            return -1;
        }

        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0) {
                return i;
            }
        }
        return -1;
    }
}
