import java.io.*;
import java.util.*;

public class p490a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" "); 
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();

        for (int i = 0; i < l; i++) {
            if (Integer.parseInt(s[i]) == 1) {
                arr1.add(i + 1);
            }

            if (Integer.parseInt(s[i]) == 2) {
                arr2.add(i + 1);
            }
            
            if (Integer.parseInt(s[i]) == 3) {
                arr3.add(i + 1);
            }            
        }
        int min = Math.min(Math.min(arr1.size(), arr2.size()), arr3.size());
        for (int i = 0; i < min; i++) {
            out.println(arr1.get(i) + " " + arr2.get(i) + " " + arr3.get(i));
        }
        System.out.println(min);
        out.flush();
    }
}
