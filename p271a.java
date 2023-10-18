import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p271a {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int year = y;            
        while (true) {
            Set<Integer> s = new HashSet<>();
            year = y + 1;
            for (int i = 3; i >= 0; i--) {
                int remainder = year % 10;
                //arr[i] = remainder;
                s.add(remainder);
                year = year / 10;
            }

            if (s.size() == 4) {
                break;
            } else {
                y++;
            }

        }

        System.out.println(y+1);
        sc.close();
    }
}
