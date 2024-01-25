import java.io.*;

public class p1722b {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            int n = Integer.parseInt(br.readLine());
            char[] s = br.readLine().toCharArray(); 
            char[] s1 = br.readLine().toCharArray(); 
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if (s[j] == 'R' && s1[j] != 'R' || s[j] != 'R' && s1[j] == 'R') {
                    flag = true;
                    break;
                }
            }
            if (flag) out.println("NO");
            else out.println("YES");
            
        }
        
        out.flush();
    }
}