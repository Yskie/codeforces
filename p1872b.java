import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//Wrong answer

public class p1872b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            int roomsToExplore = 1000;
            int roomsExplored = 0;
            int l2 = Integer.parseInt(br.readLine());
            ArrayList<Pair> a = new ArrayList<>();

            for (int j = 0; j < l2; j++) {
                String[] b = br.readLine().split(" ");
                int d = Integer.parseInt(b[0]);
                int s = Integer.parseInt(b[1]);
                a.add(new Pair(d, s));
            }

            a.sort(Comparator.comparing(Pair::getHead).thenComparing(Pair::getTail));


            for (int j = 0; j < a.size(); j++) {
                int d = a.get(j).getHead();
                int s = a.get(j).getTail();

                if (roomsToExplore >= d - roomsExplored) {
                    roomsExplored = d;
                } else {
                    break;
                }

                if (s <= 2) {
                    roomsToExplore = 0;
                } else {
                    //Tablute the rooms to explore.
                    int pr = (s - 1) / 2;
                    roomsToExplore = Math.min(pr, roomsToExplore);
                }
            }
            System.out.println(roomsExplored + roomsToExplore);

        }
    }

}


