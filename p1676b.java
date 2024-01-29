import java.io.*;

public class p1676b {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            int l1 = Integer.parseInt(br.readLine());
            String[] s = br.readLine().split(" "); 
            int[] nums = new int[l1];
            int min = 1000000001;
            for (int j = 0; j < l1; j++) {
                int num = Integer.parseInt(s[j]);
                if (num < min) min = num;
                nums[j] = num;
            }

            int o = 0;
            for (int j = 0; j < nums.length; j++) {
                o += nums[j] - min;
            }
            out.println(o);
        }
        out.flush();
    }
}