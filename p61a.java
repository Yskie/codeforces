import java.io.*;

public class p61a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] c = br.readLine().toCharArray();
        char[] c1 = br.readLine().toCharArray();
        String s = "";
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] == c[i]) {
                s += "0";
            } else {
                s += "1";
            }
        }
        out.println(s);
        out.flush();
    }   
}
