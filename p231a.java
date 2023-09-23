import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p231a {
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < l; i++) {
            String[] iA = br.readLine().split(" ");
            int r = Integer.parseInt(iA[0]) + Integer.parseInt(iA[1]) + Integer.parseInt(iA[2]);
            if (r >= 2) {
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
}
