import java.io.*;

public class p144a {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String[] l2 = br.readLine().split(" ");
        int maxNum = -1;
        int minNum = 1000;
        int minInd = -1;
        int maxInd = 1000;
        for (int i = 0; i < l; i++) {
            int elem = Integer.parseInt(l2[i]);
            if (elem == maxNum && i < maxInd) {
                maxInd = i;
            } else if (elem > maxNum) {
                maxNum = elem;
                maxInd = i;
            }

            if (elem == minNum && i > minInd) {
                minInd = i;
            } else if (elem < minNum) {
                minNum = elem;
                minInd = i;
            }
        }
        int output = maxInd + l - minInd - 1;
        if (maxInd > minInd) {
            output--;
        }
        out.println(output);
        out.flush();
    }
}