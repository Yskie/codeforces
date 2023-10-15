import java.util.*;

public class p116a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int curr = 0;
        int l = sc.nextInt();
        for (int i = 0; i < l; i++) {
            int drop = sc.nextInt();
            int join = sc.nextInt();
            curr -= drop;
            curr += join;

            if (curr > max) {
                max = curr;
            }
        }
        System.out.println(max);
        sc.close();
    }
}