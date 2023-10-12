import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1881a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            String[] a = br.readLine().split(" ");
            int i1 = Integer.parseInt(a[0]);
            int i2 = Integer.parseInt(a[1]);
            String s1 = br.readLine();
            String s2 = br.readLine();

            if (s1.contains(s2)) {
                System.out.println(0);
                continue;
            }

            StringBuilder s = new StringBuilder(s1);
            int count = 0;
            s = s.append(s);
            i1 += i1;
            count++;
            


            while (count <= i2/2 && !s.toString().contains(s2)) {
                s = s.append(s);
                i1 += i1;
                count++;
            }

            //System.out.println(s);
            //System.out.println(s2);
            if (s.toString().contains(s2)) {
                System.out.println(count);
            } else {
                System.out.println(-1);
            }
            
            
        }
    }
}