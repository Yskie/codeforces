import java.io.*;

public class p318a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] l = br.readLine().split(" ");
        int l1 = Integer.parseInt(l[0]);
        int l2 = Integer.parseInt(l[1]);

        int count = 0;

        for (int i = 1; i <= l1; i = i + 2) {
            count++;
            
            if (count == l2) {
                out.println(i);
                out.flush();
                System.exit(0);
            }
        }


        for (int i = 2; i <= l1; i = i + 2) {
            count++;
            if (count == l2) {
                out.println(i);
                out.flush();
                System.exit(0);
            }
        }



        
    }   
}