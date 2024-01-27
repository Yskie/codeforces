import java.io.*;

public class p1343b {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            int a = Integer.parseInt(br.readLine());
            int mid = a / 2;

            if (mid % 2 != 0) {
                out.println("NO");
                continue;
            }

            out.println("YES");
            int esum = 0;
            int osum = 0;
            for (int j = 1; j <= mid; j++) {
                esum += j * 2;
                out.print(j * 2);
                out.print(" ");
            }

            for (int j = 0; j < mid - 1; j++) {
                osum += j * 2 + 1;
                out.print(j * 2 + 1);
                out.print(" ");
            }

            out.print(esum - osum);
            out.println();
        }
        out.flush();
    }
}
