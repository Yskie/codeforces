import java.io.*;

public class p344a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String curr = "00";
        int count = 0;

        for (int i = 0; i < l; i++) {
            String mag = br.readLine();
            if (!curr.equals(mag)) {
                curr = mag;
                count++;
            }
        }
        System.out.println(count);
    }
}
