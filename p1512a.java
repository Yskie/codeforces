import java.io.*;

public class p1512a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            int n = Integer.parseInt(br.readLine());
            String[] s = br.readLine().split(" "); 
            String first = "0";
            String second = "0";
            int secondInd = 0;
            for (int j = 0; j < n; j++) {
                String curr = s[j];
                if (first.equals("0") || curr.equals(first)) {
                    first = curr;
                    continue;
                }

                if (!second.equals("0")) {
                    if (curr.equals(second)) {
                        secondInd = 0;
                        break;
                    } else {
                        break;
                    }
                } else {
                    secondInd = j;
                    second = curr;
                }
            }
            out.println(secondInd + 1);
        }
        out.flush();
    }
}