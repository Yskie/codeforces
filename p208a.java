import java.io.*;

public class p208a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] l = br.readLine().split("WUB");
        String output = "";
        for (int i = 0; i < l.length; i++) {
            if (l[i].equals("")) {
                continue;
            } else {
                output += l[i];
                output += " ";
            }
        }
        out.print(output.strip());
        out.flush();
    }

}