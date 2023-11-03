import java.io.*;

public class p705a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String output = "";
        for (int i = 0; i < l; i++) {
            if (i % 2 == 0) {
                output += "I hate that ";
            } else {
                output += "I love that ";
            }
        }
        out.println(output.substring(0, output.length() - 5) + "it");
        out.flush();
    }
}