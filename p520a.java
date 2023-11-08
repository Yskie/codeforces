import java.io.*;
import java.util.*;

public class p520a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        char[] l2 = br.readLine().toLowerCase().toCharArray();
        char[] data = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 
    't', 'u', 'v', 'w', 'x', 'y', 'z'};

        List<char[]> a = Arrays.asList(data);
        System.out.println(a.get(1));

        



        out.flush();
    }   
}