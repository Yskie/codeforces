import java.io.*;

public class p467a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int e = 0;
        for (int i = 0; i < l; i++) {
            String[] s = br.readLine().split(" ");
            if (Integer.parseInt(s[1]) > Integer.parseInt(s[0])) {
                e++;
            }

            
        }
        out.println(e);        
        out.flush();
    }
}