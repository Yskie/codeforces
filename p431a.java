import java.io.*;

public class p431a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int s1 = Integer.parseInt(s[0]);
        int s2 = Integer.parseInt(s[1]);
        int s3 = Integer.parseInt(s[2]);
        int s4 = Integer.parseInt(s[3]);
        int o = 0;
        char[] k = br.readLine().toCharArray();
        for (int i = 0; i < k.length; i++) {
            char c = k[i];
            if (c == '1') {
                o += s1;
            }

            if (c == '2') {
                o += s2;
            }
            
            if (c == '3') {
                o += s3;
            }
            
            if (c == '4') {
                o += s4;
            }            
        }
        out.println(o);
        out.flush();
    }
}