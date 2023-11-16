import java.io.*;

public class p131a {
    public static boolean isUpper(char c) {
        return c < 96;
    }

    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] l = s.toCharArray();
        boolean works = true;

        for (int i = 1; i < l.length; i++) {
            if (!isUpper(l[i])) {
                works = false;
                break;
            }

        }

        if (works) {
            String[] ss = s.split("");
            for (int i = 0; i < ss.length; i++) {
                if (isUpper(l[i])) {
                    out.print(ss[i].toLowerCase());
                } else {
                    out.print(ss[i].toUpperCase());
                }
            }

        } else {
            out.print(s);
        }

        out.flush();
    }
}