import java.io.*;

public class p1030a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String[] c = br.readLine().split(" ");
        String o = "EASY";
        for (int i = 0; i < l; i++) {
            if (c[i].equals("1")) {
                o = "HARD";
                break;
            }
        }
        System.out.println(o);
        
    }
}