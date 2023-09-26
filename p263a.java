import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p263a {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i < 6; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 1; j < 6; j++) {
                if (s[j - 1].equals("1")) {
                    int results = Math.abs(3 - j) + Math.abs(3 - i);
                    System.out.println(results);
                    break;
                } 
            }
        }
    }
}