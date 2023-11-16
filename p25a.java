import java.io.*;
import java.util.*;

public class p25a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < l; i++) {
            int curr = Integer.parseInt(s[i]);
            arr.add(curr);
            if (map.get(curr) == null) {
                map.put(curr, 0);
            }
        }

        if (map.size() == 2) {
            for (int i = 0; i < l; i++) {
                int elem = arr.get(i);
                map.replace(elem, map.get(elem) + 1);
            }

            for (int i : map.keySet()) {
                if (map.get(i) == 1) {
                    System.out.println(arr.indexOf(i) + 1);
                    System.exit(0);
                }
            }
        }

        HashMap<Integer, Integer> map2 = new HashMap<>();
        int mC = 0;
        int mD = 0;
        // Projection method.
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 1; i < l; i++) {
            int diff = arr.get(i) - arr.get(i - 1);            
            a.add(diff);
            //System.out.println(diff);

            if (map2.get(diff) == null) {
                map2.put(diff, 1);
            } else {
                int neww = map2.get(diff) + 1;
                if (neww > mD) {
                    mD = neww;
                    mC = diff;
                }
                map2.replace(diff, neww);
                
            }
        }

        for (int i = 0; i < l - 1; i++) {
            if (a.get(i) != mC) {
                if (i == 0) {
                    if (a.get(i + 1) != mC) 
                        out.println(i + 2);
                    else {
                        out.println(i + 1);
                    }
                    break;
                    
                }
                out.println(i + 2);
                break;
            }   
        }
        out.flush();
    }
}