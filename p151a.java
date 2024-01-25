import java.io.*;

public class p151a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" "); 
        int div = Integer.parseInt(s[0]);
        int lit = Integer.parseInt(s[1]) * Integer.parseInt(s[2]);
        int slice = Integer.parseInt(s[3]) * Integer.parseInt(s[4]);
        int salt = Integer.parseInt(s[5]);

        int eachLitre = Integer.parseInt(s[6]);
        int eachSalt = Integer.parseInt(s[7]);

        int minLit = lit / eachLitre;
        int minSalt = salt / eachSalt;

        int min = Math.min(Math.min(minLit, minSalt), slice);

        out.println(min / div);
        out.flush();
    }
}
