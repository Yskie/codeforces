import java.io.*;

public class p468a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long l = Long.parseLong(br.readLine());
        if (l % 2 == 0) {
            out.println(l/2);
        } else {
            long mid = l + 1;
            long output = mid / 2;
            out.println(-output);
        }
        out.flush();
    }   
}