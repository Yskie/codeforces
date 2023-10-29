import java.io.*;

public class p318a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] l = br.readLine().split(" ");
        long l1 = Long.parseLong(l[0]);
        long l2 = Long.parseLong(l[1]);

        long count = 0;
        boolean runOdd = true;
        long mid;

        if (l1 % 2 == 0) {
            mid = l1 / 2;
        } else {
            mid = l1 / 2 + 1;
        }

        if (l2 > mid) {
            count = mid;
            runOdd = false;
        }

        if (runOdd) {

        for (long i = 1; i <= l1; i = i + 2) {
            count++;
            
            if (count == l2) {
                out.println(i);
                out.flush();
                System.exit(0);
            }
        }
        } else {

        for (long i = 2; i <= l1; i = i + 2) {
            count++;
            if (count == l2) {
                out.println(i);
                out.flush();
                System.exit(0);
            }
        }
        }


        
    }   
}