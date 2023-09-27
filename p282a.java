import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p282a {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int output = 0;
        for (int i = 0; i < l; i++) {
            char[] a = br.readLine().toCharArray();
            for (int j = 0; j < a.length; j++) {
                if (a[j] == '+') {
                    output++;
                    break;
                } else if (a[j] == '-') {
                    output--;
                    break;
                }
            }
        }
        System.out.println(output);
    }}