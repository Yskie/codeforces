import java.io.*;

public class p996a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int o = 0;
        int a = l / 100;
        o += a;
        l -= a * 100;
        int b = l / 20;
        o += b;
        l -= b * 20;
        int c = l / 10;
        o += c;
        l -= c * 10;
        int d = l / 5;
        o += d;
        l -= d * 5;
        o += l;
        System.out.println(o);    
        out.flush();
    }   
}
