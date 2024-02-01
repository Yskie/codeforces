import java.io.*;

public class p1829a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String[] check = "codeforces".split("");
        for (int i = 0; i < l; i++) {
            int ind = 0;
            String[] s = br.readLine().split("");
            for (int j = 0; j < s.length; j++) {
                if (!s[j].equals(check[j])) {
                    ind++;
                }
            }
            out.println(ind);
        }
        out.flush();
    }
}