import java.io.*;

public class p785a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < l; i++) {
            String s = br.readLine();
            if (s.equals("Tetrahedron")) count += 4;
            if (s.equals("Cube")) count += 6;
            if (s.equals("Octahedron")) count += 8;
            if (s.equals("Dodecahedron")) count += 12;
            if (s.equals("Icosahedron")) count += 20;
        }
        out.println(count);
        out.flush();
    }   
}