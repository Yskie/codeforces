import java.util.Scanner;

public class p677a {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a > h) {
                count++;
            }
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}