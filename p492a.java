import java.io.*;
import java.util.*;

public class p492a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" "); 
        int s1 = Integer.parseInt(s[0]);
        int s2 = Integer.parseInt(s[1]);
        String[] lan = br.readLine().split(" ");
        ArrayList<Double> ord = new ArrayList<>();
        double output = 0;
        for (int i = 0; i < s1; i++) {
            ord.add(Double.parseDouble(lan[i]));
        }

        Collections.sort(ord);

        for (int i = 0; i < s1 - 1; i++) {                        
            double diff = (ord.get(i + 1) - ord.get(i)) / 2;
            if (diff > output) output = diff;
        }

        //Get the start and end.
        double sDiff = (ord.get(0));
        double eDiff = (s2 - ord.get(s1 - 1));

        if (sDiff > output) output = sDiff;
        if (eDiff > output) output = eDiff;
        System.out.println(output);
        out.flush();
    }
}