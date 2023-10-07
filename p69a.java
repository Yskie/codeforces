import java.util.*;

public class p69a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        for (int i = 0; i < l; i++) {
            v1 += sc.nextInt();
            v2 += sc.nextInt();
            v3 += sc.nextInt();
        }

        if (v1 == 0 && v2 ==0 && v3 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();

    }
}