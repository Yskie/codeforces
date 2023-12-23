import java.io.*;
import java.util.*;

public class p1560a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < l; i++) {
            int n = Integer.parseInt(br.readLine());
            arr.add(n);
            if (n > max) max = n;
        }
        int[] intA = new int[max];
        Integer curr = 1;
        
        for (int i = 0; i < max; i++) {
            while (curr.toString().charAt(curr.toString().length() - 1) == '3' || curr % 3 == 0) {
                curr++;
            }
            intA[i] = curr;
            curr++;
        }

        for (int i = 0; i < l; i++) {
            int ind = arr.get(i) - 1;
            out.println(intA[ind]);
        }
        
        
        out.flush();
    }
}