import java.io.*;
import java.util.*;

public class p1722a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            int n = Integer.parseInt(br.readLine());
            char[] s = br.readLine().toCharArray();

            if (n < 5) {
                out.println("NO");
                continue;
            }

            boolean Tflag = false;
            boolean iflag = false;
            boolean mflag = false;
            boolean uflag = false;
            boolean rflag = false;
            boolean failed = false;

            for (int j = 0; j < n; j++) {
                if (s[j] == 'T' && !Tflag) {
                    Tflag = true;
                    continue;
                }

                if (s[j] == 'i' && !iflag) {
                    iflag = true;
                    continue;
                }

                if (s[j] == 'm' && !mflag) {
                    mflag = true;
                    continue;
                }

                if (s[j] == 'u' && !uflag) {
                    uflag = true;
                    continue;
                }

                if (s[j] == 'r' && !rflag) {
                    rflag = true;
                    continue;
                }

                failed = true;
                break;
            }

            if (!failed) {
                out.println("YES");
            } else {
                out.println("NO");

            }
        }
        out.flush();
    }
}