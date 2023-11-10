import java.io.*;

public class p148a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l1 = Integer.parseInt(br.readLine());
        int l2 = Integer.parseInt(br.readLine());
        int l3 = Integer.parseInt(br.readLine());
        int l4 = Integer.parseInt(br.readLine());
        int l5 = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 1; i <= l5; i++) {
            if (i % l1 == 0) {
                count++;
            } else if (i % l2 == 0) {
                count++;
            } else if (i % l3 == 0) {
                count++;
            } else if (i % l4 == 0) {
                count++;
            }
        }
        out.println(count);
        out.flush();
    }   
}