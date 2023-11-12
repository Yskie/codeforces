import java.io.*;

public class p158b {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        for (int i = 0; i < l; i++) {
            if (s[i].equals("1")) {
                c1++;
            }
            if (s[i].equals("2")) {
                c2++;
            }            
            if (s[i].equals("3")) {
                c3++;
            }
            if (s[i].equals("4")) {
                c4++;
            }
        }

        int total = c4;        

        int bothMin = Math.min(c1, c3);
        c1 -= bothMin;
        total += c3;
        total += c2 / 2;

        //2 seaters can try to fit themselves first.
        if (c2 % 2 != 0) {
            //1 set of 2 leftover
            if (c1 <= 2) {
                total++;
                System.out.println(total);
                System.exit(0);
            }
            c1 -= 2; 
            total++;
        } 

        if (c1 % 4 != 0) {
            total++;
        } 

        total += c1 / 4;
        out.println(total);
        out.flush();
    }   
}
