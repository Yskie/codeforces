import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p112a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine().toLowerCase();
        String s2 = br.readLine().toLowerCase();

        int res = s1.compareTo(s2);
        if (res > 0) {
            System.out.println(1);
        } else if (res < 0) {
            System.out.println(-1);
        } else {
            System.out.println(0);
        }

    }
}
