import java.io.*;

public class p1352a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            String s = br.readLine();
            Integer ii = Integer.parseInt(s);
            if (ii <= 10) {
                System.out.println(1);
                System.out.println(ii);
                continue;
            }

            String[] c = s.split("");
            int count = 1;
            int size = c.length;

            for (int j = 1; j < size; j++) {
                String cc = c[j];
                if (cc.equals("0")) {
                    continue;
                }

                out.print(Integer.parseInt(cc) * (int) Math.pow(10, (size - j - 1)));
                out.print(" ");
                count++;
            }
            System.out.println(count);
            out.print(Integer.parseInt(c[0]) * (int) Math.pow(10, (size - 1)));
            out.println();
            out.flush();
            
        }
        
    }
}