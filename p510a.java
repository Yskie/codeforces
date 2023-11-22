import java.io.*;

public class p510a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" "); 
        int s1 = Integer.parseInt(s[0]);
        int s2 = Integer.parseInt(s[1]);
        String full = "";
        String left = "#";
        String right = "";

        for (int i = 0; i < s2; i++) {
            if (i == 0) {
                full += "#";
                continue;
            }
            full += "#";
            left += ".";
            right += ".";
        }

        right += "#";

        boolean isRight = true;
        for (int i = 0; i < s1; i++) {
            if (i % 2 == 0) {
                out.println(full);
            } else if (isRight) {
                out.println(right);
                isRight = !isRight;
            } else {
                out.println(left);
                isRight = !isRight;
            }
        }

        
        out.flush();
    }
}