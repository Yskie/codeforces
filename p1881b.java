import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class p1881b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());

        for (int i = 0; i < l; i++) {
            String[] a = br.readLine().split(" ");
            int i1 = Integer.parseInt(a[0]);
            int i2 = Integer.parseInt(a[1]);
            int i3 = Integer.parseInt(a[2]);
            if (i1 == i2 && i2 == i3 && i1 == i3) {
                System.out.println("YES");
                continue;
            }
            int smallest = Math.min(i3, Math.min(i1, i2));
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(i1);
            arr.add(i2);
            arr.add(i3);
            String output = "YES";
            for (int j = 0; j < 3; j++) {
                for (int j2 = 0; j2 < arr.size(); j2++) {
                    int elem = arr.get(j2);
                    if (elem > smallest) {
                        arr.remove(j2);
                        arr.add(elem - smallest);
                        break;
                    }
                }
            }
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(j) != smallest) {
                    output = "NO";
                    break;
                }
            }

            System.out.println(output);

        }

    }
}
