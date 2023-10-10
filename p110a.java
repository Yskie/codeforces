import java.util.Scanner;

public class p110a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = sc.nextLine().toCharArray();
        int num = 0;
        for (int i = 0; i < c.length; i++) {
            char ch = c[i];
            if (ch == '4' || ch == '7') {
                num++;
            }
        }

        System.out.println((num == 7 || num == 4) ? "YES" : "NO");
        sc.close();
    }
}