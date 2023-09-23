import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1a {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String[] lA = br.readLine().split(" ");

        long m = Long.parseLong(lA[0]);
        long n = Long.parseLong(lA[1]);
        long a = Long.parseLong(lA[2]);
        long output = 0;

        if (m <= a && n <= a) {
            //Do based on n.
            output = 1L;
        } else if (m <= a) {
            if (n % a == 0) {
                output += n / a;
            } else {
                output += n / a + 1;
            }
        } else if (n <= a) {
            if (m % a == 0) {
                output += m / a;
            } else {
                output += m / a + 1;
            }
        } else {
            //Both n and m are greater than a.
            long mF = m / a;
            long nF = n / a;
            if (m % a == 0 && n % a == 0) {
                output = mF * nF;
            } else if (m % a == 0) {
                output = mF * nF + mF;
            } else if (n % a == 0) {
                output = mF * nF + nF;
            } else {
                output = mF * nF + mF + nF + 1;
            }
        }
        System.out.println(output);
        br.close();
    }
}
