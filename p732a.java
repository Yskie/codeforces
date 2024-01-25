import java.io.*;

public class p732a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" "); 
        int s1 = Integer.parseInt(s[0]);
        int s2 = Integer.parseInt(s[1]);
        int count = 1;
        while (true) {
            long curr = s1 * count;
            if (curr % 10 == 0 || (curr - s2) % 10 == 0 || curr == s2) {
                break;
            }


            count++;
        }
        out.println(count);
        out.flush();
    }
}