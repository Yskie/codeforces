import java.io.*;

public class p959a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        if (l % 2 == 0) {
            out.println("Mahmoud");
        } else {
            out.println("Ehab");
        }
        out.flush();
    }
}
