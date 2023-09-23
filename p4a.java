import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p4a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n < 4) {
            System.out.println("NO");
        } else if (n % 2 == 0) {
            if ((n - 2) % 2 ==0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        } else {
            System.out.println("NO");
        }
        
    }
}
