import java.util.Scanner;

public class p734a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        char[] s = sc.next().toCharArray();
        

        int a = 0;
        int d = 0;
        for (int i = 0; i < l; i++) {
            char k = s[i];
            if (k == 'A') {
                a++;
            } else {
                d++;
            }
        }

        if (a == d) {
            System.out.println("Friendship");
        } else {
            System.out.println(a > d ? "Anton" : "Danik");
        }
        sc.close();
    }
}