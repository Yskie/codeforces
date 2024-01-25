import java.io.*;

public class p492a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());

        int c = 0;
        int r = 0;
        int o = 0;
        while (o < l) {
            c++;
            r += c;
            o += r;
            if (o > l) {
                c--;
                break;
            }
        }        
        out.println(c);
        out.flush();
    }
}