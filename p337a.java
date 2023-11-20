import java.io.*;
import java.util.*;

public class p337a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" "); 
        int s1 = Integer.parseInt(s[0]);
        int s2 = Integer.parseInt(s[1]);

        String[] l = br.readLine().split(" "); 
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < s2; i++) {
            arr.add(Integer.parseInt(l[i]));
        }
        Collections.sort(arr);
        //Sliding window.
        int min = 1000000;
        for (int i = 0; i <= s2 - s1; i++) {
            int localMin = arr.get(i + s1 - 1) - arr.get(i);
            if (localMin < min) {
                min = localMin;
            }
        }        

        out.println(min);
        out.flush();
    }

}
