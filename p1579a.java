import java.io.*;

public class p1579a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            int a = 0;
            int b = 0;
            int c = 0;

            char[] s = br.readLine().toCharArray();
            for (int j = 0; j < s.length; j++) {
                if (s[j] == 'A') a++;
                if (s[j] == 'B') b++;
                if (s[j] == 'C') c++;
            }

            b -= a;
            b -= c;

            if (b == 0) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
        out.flush();
    }
}