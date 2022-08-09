package baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baek2558 {
    public void solution() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            System.out.println(a+b);
        } catch(Exception e) {
            e.getStackTrace();
        }
    }
}
