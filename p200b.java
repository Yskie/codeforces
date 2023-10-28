import java.io.*;

public class p200b {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        double total = 0;
        for (int i = 0; i < l; i++) {
            total += Integer.parseInt(s[i]);
        }
        out.println(total / l);

        out.flush();
    }   
}