import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;


public class p339a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split("\\+");
        int[] results = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(results);
        for (int i = 0; i < results.length; i++) {
            PrintWriter out = new PrintWriter(System.out);
            if (i != 0) {
                out.print("+");
            }
            out.print(results[i]);
            out.flush();
        }
    
        
    }
}