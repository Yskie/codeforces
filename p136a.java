import java.io.*;

public class p136a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int[] fi = new int[l];
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < s.length; i++) {
            int in = Integer.parseInt(s[i]) - 1;
            int curr = i + 1;
            fi[in] = curr;
        }

        for (int i = 0; i < fi.length; i++) {
            out.print(fi[i] + " ");
        }

        out.flush();
    }   
}