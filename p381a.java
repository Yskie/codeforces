import java.io.*;

public class p381a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");    
        int sInd = 0;
        int eInd = l - 1;
        int o1 = 0;
        int o2 = 0;
        boolean isO1 = true;
        for (int i = 0; i < l; i++) {
            int start = Integer.parseInt(s[sInd]);
            int end = Integer.parseInt(s[eInd]);
            if (start > end) {
                sInd++;
                if (isO1) o1 += start;
                else o2 += start;
            } else if (start < end) {
                eInd--;
                if (isO1) o1 += end;
                else o2 += end;                
            } else {
                if (isO1) o1 += end;
                else o2 += end;                     
            }

            isO1 = !isO1;
        }
        out.print(o1);
        out.print(" ");
        out.print(o2);
        out.flush();
    }
}
