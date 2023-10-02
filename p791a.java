import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p791a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int l = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int count = 0;

        while (l <= b) {
            count++;
            l *= 3;
            b *= 2;
        }
        System.out.println(count);
    }
}