import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p266a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        char[] s = br.readLine().toCharArray();
        int R = 0;
        int B = 0;
        int G = 0;
        int output = 0;
        for (int i = 0; i < l; i++) {
            char c = s[i];
            if (c == 'R') {
                if (R > 0) {
                    output++;
                }
                R++;
                B = 0;
                G = 0;
            } else if (c == 'B') {
                if (B > 0) {
                    output++;
                }
                B++;
                R = 0;
                G = 0;
            } else if (c == 'G') {
                if (G > 0) {
                    output++;
                }
                G++;
                R = 0;
                B = 0;
            }
        }
        System.out.println(output);
    }
}