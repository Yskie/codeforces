import java.util.Scanner;

public class p158a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int placement = sc.nextInt();
        int score = 0;
        int zeros = 0;

        for (int i = 1; i <= placement; i++) {
            int t = sc.nextInt();
            if (t == 0) {   
                zeros++;
            }
            if (i == placement) {
                score = t;
            }
        }

        if (zeros > 0) {    
            System.out.println(placement - zeros);
        } else {
            int temp = placement;
            for (int i = 1; i <= n - placement; i++) {
                int t = sc.nextInt();
                if (t == score) {
                    temp++;
                } else {
                    break;
                }
            }
            System.out.println(temp);
        }
        sc.close();
    }
}