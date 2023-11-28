import java.io.*;

public class p750a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" "); 
        int s1 = Integer.parseInt(s[0]);
        int s2 = Integer.parseInt(s[1]);

        int rem = 240 - s2;
        int output = 0;


        for (int i = 0; i < s1; i++) {
            int timeTaken = 5 * (i + 1);
            if (rem - timeTaken < 0) {
                break;
            } 
            rem -= timeTaken;
            output++;
        }

        out.println(output);
        out.flush();
    }
}