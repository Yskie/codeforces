import java.io.*;

public class p707a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int s1 = Integer.parseInt(s[0]);
        int s2 = Integer.parseInt(s[1]);
        boolean flag = false;
        for (int i = 0; i < s1; i++) {
            String[] st = br.readLine().split(" ");
            for (int j = 0; j < s2; j++) {
                if (st[j].equals("C") || st[j].equals("M") || st[j].equals("Y")) {
                    flag = true;
                    break;
                }
            }
            if (flag) break;
        }
        if (flag) {
            out.println("#Color");
        } else {
            out.println("#Black&White");
        }
        out.flush();
    }
}