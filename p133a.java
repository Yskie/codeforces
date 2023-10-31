import java.io.*;

public class p133a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] l = br.readLine().toCharArray();
        for (int i = 0; i < l.length; i++) {
            if (l[i] == 'H' || l[i] == 'Q' || l[i] == '9') {
                out.println("YES");
                out.flush();
                System.exit(0);
            }
        }
        out.println("NO");
        out.flush();
    }
}