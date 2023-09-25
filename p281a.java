import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p281a {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s.equals("")) System.out.println("");
        else System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1));
    }
}