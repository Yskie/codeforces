import java.io.*;

public class p71a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            String w = br.readLine();
            int len = w.length();
            if(len > 10) {
                PrintWriter out = new PrintWriter(System.out);
                out.print(w.charAt(0));
                out.print(len - 2);
                out.print(w.charAt(len - 1));
                out.print("\n");
                out.flush();
            } else System.out.println(w);
            
        }
        br.close();
    }
}