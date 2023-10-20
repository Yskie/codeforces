import java.util.Scanner;

public class p122a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        int[] lucky = new int[]{4, 7, 47, 74, 44, 77, 444, 447, 474, 477, 744, 747, 774, 777};
        
        for (int i = 0; i < lucky.length; i++) {
            if (num % lucky[i] == 0) {
                System.out.println("YES");
                System.exit(0);
            }   
        }
        System.out.println("NO");
        sc.close();
    }
}