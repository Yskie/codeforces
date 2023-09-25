import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1872a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            String[] sA = br.readLine().split(" ");
            int diff = Math.abs(Integer.parseInt(sA[0]) - Integer.parseInt(sA[1]));
            int cup = Integer.parseInt(sA[2]) * 2;
            
            double result = diff / cup;
            if (diff % cup == 0) {
                System.out.println((int)result);
            } else {
                System.out.println((int) result + 1);
            }
        }
    }
}
