import java.util.*;

public class p41a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] w1 = sc.nextLine().toCharArray();
        char[] w2 = sc.nextLine().toCharArray(); 
        String result = "YES";
        int len = w1.length;
        if (len != w2.length) {
            System.out.println("NO");
            sc.close();
            System.exit(0);
        }

        for (int i = 0; i < len; i++) {
            if (w1[i] != w2[len - 1 - i]) {
                result = "NO";
                break;
            }
            
        }
        System.out.println(result);
        sc.close();
    }
}