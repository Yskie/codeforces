import java.util.Scanner;

public class p58a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ind = s.indexOf("h");
        if (ind == -1) {
            System.out.println("NO");
            System.exit(0);
        }
        s = s.substring(ind + 1, s.length());

        ind = s.indexOf("e");
        if (ind == -1) {
            System.out.println("NO");
            System.exit(0);
        }
        s = s.substring(ind + 1, s.length());

        ind = s.indexOf("l");
        if (ind == -1) {
            System.out.println("NO");
            System.exit(0);
        }
        s = s.substring(ind + 1, s.length());

        ind = s.indexOf("l");
        if (ind == -1) {
            System.out.println("NO");
            System.exit(0);
        }
        s = s.substring(ind + 1, s.length());

        ind = s.indexOf("o");
        if (ind == -1) {
            System.out.println("NO");
            System.exit(0);
        }
        System.out.println("YES");

        sc.close();
    }
}