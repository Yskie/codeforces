import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class p266b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int sec = Integer.parseInt(s[1]);
        char[] q = br.readLine().toCharArray();
        for (int i = 0; i < sec; i++) {

            for (int j = 0; j < q.length - 1; j++) {
                if (q[j] == 'B' && q[j+1] == 'G') {
                    q[j] = 'G';
                    q[j+1] = 'B';
                    j++;
                }
            }
        }

        for (int i = 0; i < q.length; i++) {
            PrintWriter out = new PrintWriter(System.out);
            out.print(q[i]);
            out.flush();


        }
        
    }
}