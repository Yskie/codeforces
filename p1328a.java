import java.io.*;

public class p1328a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());
        for (int i = 0; i < line; i++) {
            String[] l = br.readLine().split(" ");
            int l1 = Integer.parseInt(l[0]);
            int l2 = Integer.parseInt(l[1]);

            if (l1 < l2) {
                System.out.println(l2 - l1);
                continue;
            }

            if (l1 % l2 == 0) {
                System.out.println(0);
                continue;
            }
            System.out.println(l2 - l1 % l2);
        }

    }
}