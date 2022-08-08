package baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/10952
 */
public class Baek10952 {
    public void solution() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while(true) {
                String s = br.readLine();
                int a = Integer.parseInt(s.split(" ")[0]);
                int b = Integer.parseInt(s.split(" ")[1]);

                if (a == 0 && b == 0) {
                    break;
                }

                System.out.println(a+b);
            }
        } catch(Exception e) {
            e.getStackTrace();
        }
    }
}
