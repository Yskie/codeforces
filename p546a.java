import java.util.*;

public class p546a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int running = 0;
        for (int i = 1; i <= n; i++)
            running += i * k;
        System.out.println((running > w) ? running - w : 0);
        sc.close();
    }
}