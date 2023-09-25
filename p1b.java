import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class p1b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            // Need to check if it is the weird one.
            String os = br.readLine();
            char[] s = os.toCharArray();
            Boolean Rstart = false;
            // Checker for Rstart
            if (s[0] == 'R') {
                Boolean checkDigit = false;
                for (int j = 1; j < s.length; j++) {
                    char tmp = s[j];
                    if (Character.isDigit(tmp)) {
                        checkDigit = true;
                    }
                    if (checkDigit == true && tmp == 'C') {
                        Rstart = true;
                        break;
                    }
                }
            }

            if (Rstart) {
                // Means I must reverse it.
                String[] splitted = os.split("C");
                String row = splitted[0].substring(1);
                int col = Integer.parseInt(splitted[1]);
                ArrayList<Character> charArr = new ArrayList<>();

                // Col needs to be converted.
                int digitPlace = 1;
                while (col != 0) {
                    // Minus col somehow
                    int remainder = (int) (col % (Math.pow(26, digitPlace)));
                    if (remainder == 0) {   
                        col -= Math.pow(26, digitPlace);
                        charArr.add('Z');
                    } else {
                        col -= remainder;
                        charArr.add((char) (remainder / Math.pow(26, digitPlace - 1) + 64));
                    }
                    digitPlace++;
                }
                PrintWriter out = new PrintWriter(System.out);
                for (int j = charArr.size() - 1; j >= 0; j--) {
                    out.print(charArr.get(j));
                }
                out.print(row);
                out.print("\n");
                out.flush();

            } else {
                //Non weird. Need to convert back.
                ArrayList<Character> charArr = new ArrayList<>();
                int colu = 0;
                String row = ""; 
                for (int j = 0; j < s.length; j++) {
                    if (Character.isDigit(s[j])) {
                        //If it is digit then~
                        row += s[j];
                    } else {
                        charArr.add(s[j]);
                    }
                }
                    
                int step = 0;
                for (int j2 = charArr.size() - 1; j2 >= 0; j2--) {
                    double factor = Math.pow(26, step);
                    colu += (charArr.get(j2) - 64) * factor;
                    step++;
                }
                PrintWriter out = new PrintWriter(System.out);
                out.print('R');
                out.print(row);
                out.print('C');
                out.print(colu);
                out.print("\n");
                out.flush();
            }

        }

    }
}
