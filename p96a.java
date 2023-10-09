import java.util.Scanner;

public class p96a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();
        boolean is0 = true;
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            char c = s[i];

            if (c == '0' && is0 || c == '1' && !is0) {
                count++;
            } else {
                is0 = !is0;
                count = 1;
            }

            if (count == 7) {
                break;
            }
        }
        System.out.println(count == 7 ? "YES" : "NO");
        sc.close();
    }
}