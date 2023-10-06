import java.util.Scanner;

public class p59a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        char[] c = w.toCharArray();
        int upper = 0;
        int lower = 0;
        for (int i = 0; i < c.length; i++) {
            if ((int) c[i] > 96) {
                lower++;
            } else {
                upper++;
            }
        }
        System.out.println(upper > lower ? w.toUpperCase() : w.toLowerCase());
        sc.close();

    }
}