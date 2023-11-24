import java.io.*;

public class p427a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" "); 
        int curr = 0;
        int output = 0;
        for (int i = 0; i < l; i++) {
            int s1 = Integer.parseInt(s[i]);
            if (s1 > 0) {
                if (s1 > 10) {
                    s1 = 10;
                }
                curr += s1;
            } else {
                //Crime happened
                if (curr >= -s1) {
                    curr += s1;
                    continue;
                }
                s1 += curr;
                output -= s1;
            }
        }       
        out.println(output);
        out.flush();
    }
}