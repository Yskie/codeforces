import java.io.*;

public class p155a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" "); 
        
        int minn = Integer.parseInt(s[0]);
        int maxx = minn;
        int o = 0;

        for (int i = 1; i < l; i++) {
            int curr = Integer.parseInt(s[i]);
            if (curr < minn) {
                minn = curr;
                o++;
            }

            if (curr > maxx) {
                maxx = curr;
                o++;
            }            
        }

        out.println(o);
        out.flush();
    }
}