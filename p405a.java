import java.io.*;
import java.util.*;

public class p405a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {

            out.print(String.valueOf(arr[i]) + " ");

        }

       out.flush();
    }
}